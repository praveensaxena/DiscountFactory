/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern3;

/**
 *
 * @author Praveen Saxena
 */
public class Startup {

    public static void main(String[] args) {

        CashRegister cashRegister = new CashRegister();

        //create some Customers and Products
        cashRegister.createProducts();
        cashRegister.createCustomer();

        //start sale
        cashRegister.startNewSale("2222");
        
        //scan each products bought
        cashRegister.scanProduct("11", 4);
        cashRegister.scanProduct("33", 5);
        cashRegister.scanProduct("44", 4);
        cashRegister.scanProduct("22", 2);
        cashRegister.scanProduct("55", 1);
        
        //generate receipt
        cashRegister.finalizeSale();
    }
}
