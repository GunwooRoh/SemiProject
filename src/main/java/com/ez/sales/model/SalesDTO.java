/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.sales.model;

import java.sql.Timestamp;

/**
 *
 * @author pc
 */
public class SalesDTO {
    private int salesNo; //판매번호
    private Timestamp salesRegdate; //판매일자
    private int memberNo; //회원번호

    public SalesDTO(){
        super();
    }
    
    public SalesDTO(int salesNo, Timestamp salesRegdate, int memberNo) {
        this.salesNo = salesNo;
        this.salesRegdate = salesRegdate;
        this.memberNo = memberNo;
    }

    public int getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(int salesNo) {
        this.salesNo = salesNo;
    }

    public Timestamp getSalesRegdate() {
        return salesRegdate;
    }

    public void setSalesRegdate(Timestamp salesRegdate) {
        this.salesRegdate = salesRegdate;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    @Override
    public String toString() {
        return "SalesDTO{" + "salesNo=" + salesNo + ", salesRegdate=" + salesRegdate + ", memberNo=" + memberNo + '}';
    }
    
    
}
