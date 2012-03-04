/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern2;

/**
 *
 * @author Praveen Saxena
 */
public class Receipt {

    private Customer cust;
    private LineItem[] items = {};
    
    CustomerAdmin ca = new CustomerInArray();
    ProductAdmin pa = new ProductInArray();
    ReceiptRenderer rr = new ReceiptToConsole();

    // create some test customers - using DIP
    public void addCustomers() {
        ca.addCustomer("1111", "Joe Smith");
        ca.addCustomer("2222", "Praveen Saxena");
        ca.addCustomer("3333", "Julie Franklin");
    }

    // create some test products - using DIP
    public void addProducts() {
        pa.addProducts();
    }

    // finds customer using CustomerID and store in Customer object
    public void findCustomer(String cid) {
        cust = ca.getCustomer(cid);
    }

    //keeps track of each product scanned at CashRegister
    public void addLineItem(String pid, int qty) {
        //Get product information
        Product p = pa.returnProduct(pid);

        //initialize line item object
        LineItem item = new LineItem(p, qty);

        // stores each line item to an array
        setItems(item);
    }

    // append line item array for each scanned product
    private void setItems(LineItem item) {
        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[temp.length - 1] = item;
        items = temp;
    }

    // generate receipt - using DIP
    public void generateReceipt() {
        rr.buildReceipt(cust, items);
    }
}
