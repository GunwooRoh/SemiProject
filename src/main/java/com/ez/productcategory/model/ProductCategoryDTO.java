/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.productcategory.model;

/**
 *
 * @author pc
 */
public class ProductCategoryDTO {
    private int pdCategoryNo; //상품분류번호
    private String pdCategory; //상품카테고리
    
    public ProductCategoryDTO(){
        super();
    }

    public ProductCategoryDTO(int pdCategoryNo, String pdCategory) {
        this.pdCategoryNo = pdCategoryNo;
        this.pdCategory = pdCategory;
    }
    
    public int getPdCategoryNo() {
        return pdCategoryNo;
    }

    public void setPdCategoryNo(int pdCategoryNo) {
        this.pdCategoryNo = pdCategoryNo;
    }

    public String getPdCategory() {
        return pdCategory;
    }

    public void setPdCategory(String pdCategory) {
        this.pdCategory = pdCategory;
    }

    @Override
    public String toString() {
        return "ProductCategoryDTO{" + "pdCategoryNo=" + pdCategoryNo + ", pdCategory=" + pdCategory + '}';
    }
    
    
    
}
