/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 * Calculates dollar discount. For each item purchased apply a 
 * dollar amount discount
 * 
 * @author Praveen Saxena
 */
public class DollarDiscount implements DiscountStrategy{

    private double discountPct = 0;
    private double dollarAmt = 0;
    private int minQty = 0;
    
    public DollarDiscount() {
        
    }

    public DollarDiscount(double amt) {
        this.dollarAmt = amt;
    }

    @Override
    public double getDollarAmt() {
        return dollarAmt;
    }

    @Override
    public void setDollarAmt(double dollarAmt) {
        this.dollarAmt = dollarAmt;
    }
    
    
    @Override
    public void setDiscountPct(double pct) {
        this.discountPct = pct;
    }

    @Override
    public void setMinQuantity(int qty) {
        this.minQty = qty;
    }

    @Override
    public double calculateDiscount(double price, int qty) {
        return (qty * dollarAmt);
    }

    @Override
    public double getDiscountPct() {
        return discountPct;
    }

    @Override
    public int getMinQuantity() {
        return minQty;
    }
    
    
    
}
