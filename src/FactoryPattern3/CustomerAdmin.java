/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern3;

/**
 *
 * @author Praveen Saxena
 */
public interface CustomerAdmin {
    
    public abstract void addCustomer(String id, String name);
    public abstract void updateCustomer(String id, String name);
    public abstract void removeCustomer(String id);
    public abstract Customer getCustomer(String id);
    
}
