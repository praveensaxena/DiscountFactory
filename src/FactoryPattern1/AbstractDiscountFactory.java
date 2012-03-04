/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Praveen Saxena
 */
public class AbstractDiscountFactory {

    private static final String FILE_NAME = "c:/temp/discountconfig.properties";

    public static DiscountStrategy getBackToSchoolDiscountInstance() {
        DiscountStrategy ds = null;

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
            String className = props.getProperty("BackToSchool");
            Class clazz = Class.forName(className);
            ds = (DiscountStrategy) clazz.newInstance();

        } catch (Exception ex) {
            System.out.println("ERROR: you must place a copy of the\n "
                    + "config.properties file in the 'c:/temp' directory of "
                    + "your computer's main hard drive.");
        }

        return ds;
    }

    public static DiscountStrategy getQuantityDiscountInstance() {
        DiscountStrategy ds = null;

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
            String className = props.getProperty("Quantity");
            Class clazz = Class.forName(className);
            ds = (DiscountStrategy) clazz.newInstance();

        } catch (Exception ex) {
            System.out.println("ERROR: you must place a copy of the\n "
                    + "config.properties file in the 'c:/temp' directory of "
                    + "your computer's main hard drive.");
        }

        return ds;
    }

    public static DiscountStrategy getDollarDiscountInstance() {
        DiscountStrategy ds = null;

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
            String className = props.getProperty("Dollar");
            Class clazz = Class.forName(className);
            ds = (DiscountStrategy) clazz.newInstance();

        } catch (Exception ex) {
            System.out.println("ERROR: you must place a copy of the\n "
                    + "config.properties file in the 'c:/temp' directory of "
                    + "your computer's main hard drive.");
        }

        return ds;
    }
}
