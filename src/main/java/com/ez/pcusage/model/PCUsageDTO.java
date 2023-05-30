/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.pcusage.model;

/**
 *
 * @author pc
 */
public class PCUsageDTO {
    private int chargedMoney; //충전금액
    private int memberNo; //회원번호
    private String remainedTime; //잔여시간
    private String usedTime; //이용시간
    private int pcNo; //pc번호
    private int gNo; //게임번호
    
    public PCUsageDTO(){
        super();
    }

    public PCUsageDTO(int chargedMoney, int memberNo, String remainedTime, String usedTime, int pcNo, int gNo) {
        this.chargedMoney = chargedMoney;
        this.memberNo = memberNo;
        this.remainedTime = remainedTime;
        this.usedTime = usedTime;
        this.pcNo = pcNo;
        this.gNo = gNo;
    }

    public int getChargedMoney() {
        return chargedMoney;
    }

    public void setChargedMoney(int chargedMoney) {
        this.chargedMoney = chargedMoney;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getRemainedTime() {
        return remainedTime;
    }

    public void setRemainedTime(String remainedTime) {
        this.remainedTime = remainedTime;
    }

    public String getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(String usedTime) {
        this.usedTime = usedTime;
    }

    public int getPcNo() {
        return pcNo;
    }

    public void setPcNo(int pcNo) {
        this.pcNo = pcNo;
    }

    public int getgNo() {
        return gNo;
    }

    public void setgNo(int gNo) {
        this.gNo = gNo;
    }

    @Override
    public String toString() {
        return "PCUsageDTO{" + "chargedMoney=" + chargedMoney + ", memberNo=" + memberNo + ", remainedTime=" + remainedTime + ", usedTime=" + usedTime + ", pcNo=" + pcNo + ", gNo=" + gNo + '}';
    }
    
    
}
