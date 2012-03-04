/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern3;

/**
 *
 * @author Praveen Saxena
 */
public class Product {
    DiscountStrategy discount;
    private String productID;
    private String productDesc;
    public double unitPrice;

    // Constructor
    public Product(String id, String desc, double price)
    {
        setProductID(id);
        setProductDesc(desc);
        setUnitPrice(price);
        discount = new NoDiscount(); 
    }
    
    
    // return Product Description
    public final String getProductDesc() {
        return productDesc;
    }

    //make sure product description is not blank before assigning
    public final void setProductDesc(String productDesc) {
        if(productDesc == null || productDesc.equalsIgnoreCase("")){
            throw new IllegalArgumentException("Product must have a description.");
        }
        this.productDesc = productDesc;
    }

    public final String getProductID(){
        return productID;
    }

    public final void setProductID(String productID){
        if (productID == null || productID.equalsIgnoreCase("")){
            throw new IllegalArgumentException("Product ID must be below 999999.");
        }
        this.productID = productID;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setDiscountStrategy(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public final double getDiscount(int qty){
        return discount.calculateDiscount(unitPrice, qty);
    }
    
    public final void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
}
