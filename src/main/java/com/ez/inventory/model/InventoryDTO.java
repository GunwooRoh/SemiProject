/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.inventory.model;

/**
 *
 * @author pc
 */
public class InventoryDTO { //재고
    private int pdNo; //상품번호
    private String pdName; //상품이름
    private int inventoryQty; //재고 수량
    
    public InventoryDTO(){
        super();
    }

    public InventoryDTO(int pdNo, String pdName, int inventoryQty) {
        this.pdNo = pdNo;
        this.pdName = pdName;
        this.inventoryQty = inventoryQty;
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

    public int getInventoryQty() {
        return inventoryQty;
    }

    public void setInventoryQty(int inventoryQty) {
        this.inventoryQty = inventoryQty;
    }

    @Override
    public String toString() {
        return "InventoryDTO{" + "pdNo=" + pdNo + ", pdName=" + pdName + ", inventoryQty=" + inventoryQty + '}';
    }
    
    
    
    
    
    
}
