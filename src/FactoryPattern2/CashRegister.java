/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern2;

/**
 *
 * @author Praveen Saxena
 */
public class CashRegister {

    Receipt receit = new Receipt();

    // Add bunch of products at the startup
    public void createProducts() {
        receit.addProducts();
    }

    // Add bunch of Customers at the startup
    public void createCustomer() {
        receit.addCustomers();
    }

    public void startNewSale(String customerNo) {
        receit.findCustomer(customerNo);
    }

    public void scanProduct(String productID, int qty) {
        receit.addLineItem(productID, qty);
    }

    public void finalizeSale() {
        receit.generateReceipt();
    }
}
