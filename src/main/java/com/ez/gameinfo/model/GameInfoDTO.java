/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.gameinfo.model;

/**
 *
 * @author pc
 */
public class GameInfoDTO { //게임
    private int gNo; //게임번호
    private String gName;//게임이름
    private int gAge; //이용연령

    public GameInfoDTO(){
        super();
    }
    
    public GameInfoDTO(int gNo, String gName, int gAge) {
        this.gNo = gNo;
        this.gName = gName;
        this.gAge = gAge;
    }

    public int getgNo() {
        return gNo;
    }

    public void setgNo(int gNo) {
        this.gNo = gNo;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public int getgAge() {
        return gAge;
    }

    public void setgAge(int gAge) {
        this.gAge = gAge;
    }

    @Override
    public String toString() {
        return "GameInfoDTO{" + "gNo=" + gNo + ", gName=" + gName + ", gAge=" + gAge + '}';
    }
    
    
    
    
}
