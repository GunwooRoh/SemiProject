/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.ez.member.model;

import com.ez.db.DbUtil;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class MemberDAO {
    public static final int LOGIN_ON = 1; // 로그인 성공
    public static final int PWD_DISAGREE = 2; // 비밀번호 불일치
    public static final int USERID_NONE = 3; // 해당 아이디 없음
    
    
    public int loginCheck(String userid, String pwd) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            
            //1,2
            con = DbUtil.getConnection();
            
            //3
            String sql = "select pwd from member where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, userid);
            
            //4
            int result = 0;
            rs = ps.executeQuery();
            if(rs.next()){
                String dbPwd = rs.getString(1);
                if(dbPwd.equals(pwd)){
                    result = LOGIN_ON; //로그인 성공 1
                }else{
                    result = PWD_DISAGREE;//비밀번호 불일치 2
                }
            }else{
                result = USERID_NONE; //해당 데이터 아이디 자체가 없음
            }
            
            System.out.println("로그인 결과, result=" + result + ", 매개변수 userid=" + userid + ", pwd=" + pwd);
            return result;
        }finally{
            //5
            DbUtil.dbClose(rs, ps, con);
        }
    }
    
    // member테이블 뿌리는 DAO -조상혁
    public List<MemberDTO> showMemberAll() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = DbUtil.getConnection();
            String sql = "select memberno, id, name, birth, gender,hp  from member";
            ps = con.prepareStatement(sql);
            
            ArrayList<MemberDTO>  list = new ArrayList<>();
            rs = ps.executeQuery();
            while(rs.next()){
                MemberDTO dto = new MemberDTO();
                dto.setMemberNo(rs.getInt("memberno"));
                dto.setId(rs.getString("id"));
                dto.setName(rs.getString("name"));
                dto.setBirth(rs.getTimestamp("birth"));
                dto.setGender(rs.getString("gender"));
                dto.setHp(rs.getString("hp"));
                list.add(dto);
            }
            return list;
        }finally{
            DbUtil.dbClose(rs, ps, con);
        }
    }

    public MemberDTO selectByNo(int no) throws SQLException { //번호로 조회 : 임성완
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        MemberDTO dto = new MemberDTO();

        try{
            //1,2
            con = DbUtil.getConnection();
            //3
            String sql = "select * from member where memberNo=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, no);
            
            rs = ps.executeQuery();
            if(rs.next()){
                int memberNo = rs.getInt("memberNo");
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                Timestamp birth = rs.getTimestamp("birth");
                String gender = rs.getString("gender");
                String hp = rs.getString("hp");
                
                dto.setMemberNo(memberNo);
                dto.setId(id);
                dto.setPwd(pwd);
                dto.setName(name);
                dto.setBirth(birth);
                dto.setGender(gender);
                dto.setHp(hp);
            }
            System.out.println("번호로 조회 결과, dto=" + dto + ", 매개변수 no=" + no);
            return dto;
        }finally{
            DbUtil.dbClose(rs, ps, con);
        }
    }
    
}
