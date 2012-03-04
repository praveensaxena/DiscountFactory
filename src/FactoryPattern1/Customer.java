/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern1;

/**
 *
 * @author Praveen Saxena
 */
public class Customer {
    private String customerID;
    private String customerName;
    
    public Customer(String id, String name)
    {
       setCustomerID(id);
       setCustomerName(name);
    }

    public final String getCustomerID() {
        return customerID;
    }

    private void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public final String getCustomerName() {
        return customerName;
    }

    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
}
