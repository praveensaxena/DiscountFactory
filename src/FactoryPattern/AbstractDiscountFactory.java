/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */
public class AbstractDiscountFactory {

    public static enum Discounts {
        BackToSchool, QuantityDiscount, NODiscount, DollarDiscount
    }

    public static DiscountStrategy getDiscountStrategyInstance(Discounts discountType) {
        DiscountStrategy dis = DiscountFactory
                .getInstance()
                .getDiscountStrategy(discountType);
        return dis;
    }
}
