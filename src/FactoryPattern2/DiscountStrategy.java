/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern2;

/**
 *
 * @author Praveen Saxena
 */
public interface DiscountStrategy {
    
    public abstract void setDiscountPct(double pct);
    
    public abstract double getDiscountPct();
    
    public abstract void setMinQuantity(int qty);
    
    public abstract int getMinQuantity();
    
    public abstract void setDollarAmt(double dollarAmt);
    
    public abstract double getDollarAmt();
    
    public abstract double calculateDiscount(double price, int qty);
    
}
