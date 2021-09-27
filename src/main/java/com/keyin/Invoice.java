package com.keyin;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    static int invoiceCount = 0;

    Invoice(String id, String desc, int qty, double unitPrice){
        this.id =id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    Invoice(Invoice i){
        this.id =i.id;
        this.desc = i.desc;
        this.qty = i.qty;
        this.unitPrice = i.unitPrice;
        invoiceCount++;
    }

    public String getID(){
        return this.id;
    }

    public String getDesc(){
        return this.desc;
    }

    public void getQty(int qty){
        this.qty = qty;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return (unitPrice * qty);
    }
    public String toString(){
        return (getDesc() + "\n" + "Id num : " + this.id + "\n" + "Quantity : " + this.qty + "\n" + "Unit Price : $" + this.unitPrice) + "\n" + "Number of invoices to date :" + invoiceCount + "\n\n";
    }
}
