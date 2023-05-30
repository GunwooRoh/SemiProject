/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.pcinfo.model;

/**
 *
 * @author pc
 */
public class PCInfoDTO { // PC
    private int pcNo; // pc번호
    private int memberNo; //회원번호

    public PCInfoDTO() {
        super();
    }

    public PCInfoDTO(int pcNo, int memberNo) {
        this.pcNo = pcNo;
        this.memberNo = memberNo;
    }

    public int getPcNo() {
        return pcNo;
    }

    public void setPcNo(int pcNo) {
        this.pcNo = pcNo;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    @Override
    public String toString() {
        return "PCInfoDTO{" + "pcNo=" + pcNo + ", memberNo=" + memberNo + '}';
    }
    
    
    
}


