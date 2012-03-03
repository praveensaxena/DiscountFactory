/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */
public interface DiscountStrategy {
    
    public abstract void setDiscountPct(double pct);
    
    public abstract void setMinQuantity(int qty);
    
    public abstract void setDollarAmt(double dollarAmt);
    
    public abstract double calculateDiscount(double price, int qty);
    
}
