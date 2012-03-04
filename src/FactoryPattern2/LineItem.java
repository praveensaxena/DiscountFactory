/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern2;

/**
 *
 * @author Praveen Saxena
 */
public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product p, int q) {
        this.product = p;
        this.quantity = q;
    }

    public final Product getProduct() {
        return product;
    }

    public final int getQuantity() {
        return quantity;
    }
    
    public final double getDiscountAmt() {
        return product.getDiscount(quantity);
    }

    public final double getItemTotal() {
        return (product.getUnitPrice() * quantity);
    }

    public final double getSubtotal() {
        return ((product.getUnitPrice() * quantity) - (product.getDiscount(quantity)));
    }
}
