/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.salesdetail.model;

/**
 *
 * @author pc
 */
public class SalesDetailDTO {
    private int salesNo; //판매번호
    private int pdNo; //상품번호
    private int salesQty; //판매수량
    
    public SalesDetailDTO(){
        super();
    }

    public SalesDetailDTO(int salesNo, int pdNo, int salesQty) {
        this.salesNo = salesNo;
        this.pdNo = pdNo;
        this.salesQty = salesQty;
    }

    public int getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(int salesNo) {
        this.salesNo = salesNo;
    }

    public int getPdNo() {
        return pdNo;
    }

    public void setPdNo(int pdNo) {
        this.pdNo = pdNo;
    }

    public int getSalesQty() {
        return salesQty;
    }

    public void setSalesQty(int salesQty) {
        this.salesQty = salesQty;
    }

    @Override
    public String toString() {
        return "SalesDetailDTO{" + "salesNo=" + salesNo + ", pdNo=" + pdNo + ", salesQty=" + salesQty + '}';
    }
    
    
}
