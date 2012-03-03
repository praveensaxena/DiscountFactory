/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceiptToConsole implements ReceiptRenderer
{

    NumberFormat nf = NumberFormat.getCurrencyInstance();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    
  
    @Override
    public void buildReceipt(Customer c, LineItem[] items) {
        double grandTotal = 0;
        double totalDiscount = 0;
        
        System.out.println("**************** RECEIPT *******************");
        System.out.println("      Wolly World Department Store");
        System.out.println("         " + dateFormat.format(date));
        System.out.println("********************************************");
        System.out.println("Customer : " + c.getCustomerName());
        System.out.println("Account# : " + c.getCustomerID());
        System.out.println("");
        System.out.println("Item    Desc         UnitPrice  Qty       Total  Discount  SubTotal");
        System.out.println("-------------------------------------------------------------------");
        for(LineItem l: items ){
            Product prod = l.getProduct();
            
            System.out.format("%-8s%-13s%9s%5s%12s%10s%10s", 
                    prod.getProductID(),
                    prod.getProductDesc(),
                    nf.format(prod.getUnitPrice()),
                    l.getQuantity(),
                    nf.format(l.getItemTotal()),
                    nf.format(l.getDiscountAmt()),
                    nf.format(l.getSubtotal())
                    );
            System.out.println("");
            grandTotal += l.getSubtotal();
            totalDiscount += l.getDiscountAmt();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Grand Total : " + nf.format(grandTotal));
        System.out.println("Your total Savings : " + nf.format(totalDiscount));    
    }
    
}
