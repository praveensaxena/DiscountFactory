/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern2;

/**
 *
 * @author Praveen Saxena
 */
public class DiscountFactory {

    private static DiscountFactory instance;

    private DiscountFactory() {
    }

    /**
     * Needed to get a Singleton instance. Why? Because the constructor needs to
     * be private.
     */
    public static DiscountFactory getInstance() {
        if (instance == null) {
            instance = new DiscountFactory();
        }
        return instance;
    }

    /**
     * This is the actual Factory method.
     *
     * @param discountType - a type safe enum representing the type of Reader to
     * create.
     * @return a DiscountStrategy built to spec
     */
    public DiscountStrategy getDiscountStrategy(AbstractDiscountFactory.Discounts discountType) {
        DiscountStrategy d = null;

        switch (discountType) {
            case BackToSchool:
                d = new BackToSchoolDiscount();
                break;
            case QuantityDiscount:
                d = new QuantityDiscount();
                break;
            case NODiscount:
                d = new NoDiscount();
                break;
            case DollarDiscount:
                d = new DollarDiscount();
                break;
        }

        return d;
    }
}
