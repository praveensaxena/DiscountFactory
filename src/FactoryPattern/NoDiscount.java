/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */
public class NoDiscount implements DiscountStrategy {
    
    private double disount_amt = 0;   
    private double discountPct = 0;
    private double dollarAmt = 0;
    private int minQty = 0;
    

    @Override
    public double calculateDiscount(double price, int qty) {
        return this.disount_amt;
    }

    @Override
    public void setDiscountPct(double pct) {
        
    }

    @Override
    public void setMinQuantity(int qty) {
        
    }

    @Override
    public void setDollarAmt(double dollarAmt) {
        
    }

    @Override
    public double getDiscountPct() {
        return discountPct;
    }

    @Override
    public int getMinQuantity() {
        return minQty;
    }

    @Override
    public double getDollarAmt() {
        return dollarAmt;
    }
    
}
