/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern3;

/**
 *
 * @author Praveen Saxena
 */
public class CustomerInArray implements CustomerAdmin {

    private Customer[] customers = {};

    @Override
    public final void addCustomer(String id, String name) {
        Customer newcust = new Customer(id, name);
        addCustomerInArray(newcust);
    }

    @Override
    public Customer getCustomer(String id) {
        Customer cust = new Customer(id, "New Customer");
        for (int i = 0; i < customers.length; i++)
        {
            if (customers[i].getCustomerID().equalsIgnoreCase(id)){
                cust = customers[i];
                break;
            }
        }
        return cust;
    }

    private void addCustomerInArray(Customer c) {
        Customer[] temp = new Customer[customers.length + 1];
        System.arraycopy(customers, 0, temp, 0, customers.length);
        temp[temp.length - 1] = c;
        customers = temp;
    }

    /*
     * FOR FUTURE USE
     */
    @Override
    public void updateCustomer(String id, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeCustomer(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
