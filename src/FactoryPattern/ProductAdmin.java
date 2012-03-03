/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */
public interface ProductAdmin {

    public abstract void addProducts();

    public abstract void updateProduct(String id, double price);

    public abstract void removeProduct(String id);

    public abstract Product returnProduct(String id);
    
}
