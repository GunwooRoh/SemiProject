/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.income.model;

/**
 *
 * @author pc
 */
public class IncomeDTO { //입고
    private int pdNo; //상품번호
    private String pdName; //상품이름
    private int incomeQty; //입고 수량

    public IncomeDTO(){
        super();
    }
    
    public IncomeDTO(int pdNo, String pdName, int incomeQty) {
        this.pdNo = pdNo;
        this.pdName = pdName;
        this.incomeQty = incomeQty;
    }

    public int getPdNo() {
        return pdNo;
    }

    public void setPdNo(int pdNo) {
        this.pdNo = pdNo;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public int getIncomeQty() {
        return incomeQty;
    }

    public void setIncomeQty(int incomeQty) {
        this.incomeQty = incomeQty;
    }

    @Override
    public String toString() {
        return "IncomeDTO{" + "pdNo=" + pdNo + ", pdName=" + pdName + ", incomeQty=" + incomeQty + '}';
    }
    
    
    
}
