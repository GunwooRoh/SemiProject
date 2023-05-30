/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.member.model;

import java.sql.Timestamp;

/**
 *
 * @author pc
 */
public class MemberDTO {
    private int memberNo; //회원번호
    private String id; // 아이디
    private String pwd; // 비밀번호
    private String name; // 이름
    private Timestamp birth; // 생일
    private String gender; // 성별 
    private String email; // 이메일
    private String hp; // 전화번호

    public MemberDTO(){
        super();
    }
    
    public MemberDTO(int memberNo, String id, String pwd, String name, Timestamp birth, String gender, String email, String hp) {
        this.memberNo = memberNo;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.email = email;
        this.hp = hp;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getBirth() {
        return birth;
    }

    public void setBirth(Timestamp birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "MemberDTO{" + "memberNo=" + memberNo + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", birth=" + birth + ", gender=" + gender + ", email=" + email + ", hp=" + hp + '}';
    }
    
    
    
    
    
}
