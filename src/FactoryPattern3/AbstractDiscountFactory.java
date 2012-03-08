/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Praveen Saxena
 */
public class AbstractDiscountFactory {
    public static enum Discounts {
        BackToSchool, QuantityDiscount, NODiscount, DollarDiscount
    }
    
    private static final String FILE_NAME = "c:/temp/discountconfig.properties";

    
    public static DiscountStrategy getDiscountInstance(Discounts discountType) {
        DiscountStrategy ds = null;
        String disType = discountType.toString();
        // First read config setting in properties file
        File file = new File(FILE_NAME);
        Properties props = new Properties();
        FileInputStream inFile;

        try {
            inFile = new FileInputStream(file);
            props.load(inFile);
            inFile.close();


            props.propertyNames();
            // Next use Java reflection to create instance
            String className = props.getProperty(disType);
            Class clazz = Class.forName(className);
            ds = (DiscountStrategy) clazz.newInstance();

        } catch (Exception ex) {
            System.out.println("ERROR: you must place a copy of the\n "
                    + "discountconfig.properties file in the 'c:/temp' directory of "
                    + "your computer's main hard drive.");
        }

        return ds;
    }
}
