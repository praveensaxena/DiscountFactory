/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern1;

/**
 *
 * @author Praveen Saxena
 */
public interface ReceiptRenderer {
    
    public abstract void buildReceipt(Customer c, LineItem[] items);
    
}
