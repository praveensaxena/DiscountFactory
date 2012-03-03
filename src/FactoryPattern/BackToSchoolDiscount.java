/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */
public class BackToSchoolDiscount implements DiscountStrategy {

    private double discountPct = 0;

    public BackToSchoolDiscount() {
    }

    
    public BackToSchoolDiscount(double discPct) {
        this.discountPct = discPct;
    }

    public double getDiscountPct() {
        return discountPct;
    }

    @Override
    public void setDiscountPct(double discountPct) {
        this.discountPct = discountPct;
    }
    
    @Override
    public double calculateDiscount(double price, int qty) {
        return (price * qty * (discountPct / 100));
    }

    @Override
    public void setMinQuantity(int qty) {
        
    }

    @Override
    public void setDollarAmt(double dollarAmt) {
        
    }
}
