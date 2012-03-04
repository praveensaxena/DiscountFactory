/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern2;

/**
 *
 * @author Praveen Saxena
 */
public class QuantityDiscount implements DiscountStrategy {

    private double discountPct = 0;
    private double dollarAmt = 0;
    private int minQty = 0;

    public QuantityDiscount() {
    }

    public QuantityDiscount(int minQty, double discPct) {
        this.minQty = minQty;
        this.discountPct = discPct;
    }

    @Override
    public int getMinQuantity() {
        return minQty;
    }

    @Override
    public void setMinQuantity(int minQuantity) {
        this.minQty = minQuantity;
    }

    @Override
    public double getDiscountPct() {
        return discountPct;
    }

    @Override
    public void setDiscountPct(double discountPct) {
        this.discountPct = discountPct;
    }

    @Override
    public double calculateDiscount(double price, int qty) {
        double discountAmt = 0;
        if (qty >= minQty) {
            discountAmt = (price * qty * (discountPct / 100));
        }
        return discountAmt;
    }

    @Override
    public void setDollarAmt(double dollarAmt) {
        this.dollarAmt = dollarAmt;
    }

    @Override
    public double getDollarAmt() {
        return dollarAmt;
    }
}
