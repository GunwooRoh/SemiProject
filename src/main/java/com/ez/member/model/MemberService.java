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
public class MemberService {
    private static String userid;
    private static String loginTime;

    public static String getUserid() {
        return userid;
    }

    public static void setUserid(String userid) {
        MemberService.userid = userid;
    }

    public static String getLoginTime() {
        return loginTime;
    }

    public static void setLoginTime(String loginTime) {
        MemberService.loginTime = loginTime;
    }


    
    
    
    
    
}
