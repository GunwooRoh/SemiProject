/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.proudct.model;

/**
 *
 * @author pc
 */
public class ProductDTO {
    private int pdNo; //상품번호
    private String pdName; //상품이름
    private int pdCategoryNo; //상품분류번호
    private int pdPrice; //상품가격
    
    public ProductDTO(){
        super();
    }

    public ProductDTO(int pdNo, String pdName, int pdCategoryNo, int pdPrice) {
        this.pdNo = pdNo;
        this.pdName = pdName;
        this.pdCategoryNo = pdCategoryNo;
        this.pdPrice = pdPrice;
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

    public int getPdCategoryNo() {
        return pdCategoryNo;
    }

    public void setPdCategoryNo(int pdCategoryNo) {
        this.pdCategoryNo = pdCategoryNo;
    }

    public int getPdPrice() {
        return pdPrice;
    }

    public void setPdPrice(int pdPrice) {
        this.pdPrice = pdPrice;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "pdNo=" + pdNo + ", pdName=" + pdName + ", pdCategoryNo=" + pdCategoryNo + ", pdPrice=" + pdPrice + '}';
    }
    
}
