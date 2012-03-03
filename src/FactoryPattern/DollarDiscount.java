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

    private double dollarAmt = 0;

    public DollarDiscount() {
        
    }

    public DollarDiscount(double amt) {
        this.dollarAmt = amt;
    }

    public double getDollarAmt() {
        return dollarAmt;
    }

    @Override
    public void setDollarAmt(double dollarAmt) {
        this.dollarAmt = dollarAmt;
    }
    
    
    @Override
    public void setDiscountPct(double pct) {
        
    }

    @Override
    public void setMinQuantity(int qty) {
        
    }

    @Override
    public double calculateDiscount(double price, int qty) {
        return (qty * dollarAmt);
    }
    
    
    
}
