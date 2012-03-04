/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Praveen Saxena
 */
public class ProductInArray implements ProductAdmin {

    Product[] products = {};

    @Override
    public void addProducts()
    {
        Product shirt       = new Product("11", "Shirt", 20.0);
        DiscountStrategy qtyDis = AbstractDiscountFactory.getQuantityDiscountInstance();
        qtyDis.setDiscountPct(20);
        qtyDis.setMinQuantity(2);
        System.out.println("Quantity Disc " + qtyDis.getDiscountPct());
        shirt.setDiscountStrategy(qtyDis);
        
        Product poloShirt   = new Product("22", "PoloShirt", 25.0);
        DiscountStrategy btsd = AbstractDiscountFactory.getBackToSchoolDiscountInstance();
        btsd.setDiscountPct(12);
        System.out.println("BackToSchool " + btsd.getDiscountPct());
        poloShirt.setDiscountStrategy(btsd);
        
        Product shoe        = new Product("33", "Shoe", 80.0);
        DiscountStrategy dad = AbstractDiscountFactory.getDollarDiscountInstance();
        dad.setDollarAmt(10);
        System.out.println("Dollar " + dad.getDollarAmt());
        shoe.setDiscountStrategy(dad);
        
        Product sandel      = new Product("44", "Sandles", 120.0);
        Product iPad        = new Product("55", "IPad", 500);

        Product[] prodList = {shirt, poloShirt, shoe, sandel, iPad};
        products = prodList;
    }

    @Override
    public Product returnProduct(String id) {
        Product p = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductID().equalsIgnoreCase(id)) {
                p = products[i];
                break;
            }
        }
        return p;
    }

    // FOR FUTURE USE
    @Override
    public void updateProduct(String id, double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeProduct(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
