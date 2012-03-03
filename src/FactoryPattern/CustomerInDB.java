/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */
public class CustomerInDB implements CustomerAdmin{

    @Override
    public void addCustomer(String id, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateCustomer(String id, String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeCustomer(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customer getCustomer(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
