package com.vendingmachine;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Assert;


public class ProductTest {
        private Product prod;

        @Test(expected = IllegalArgumentException.class)
        public void productIDTestNegativeNUmber(){
            int productID = -5;
            Product prod1 = new Product(productID, "fanta", 1.50);
        }

        @Test
        public void productIDTestPositiveNUmber(){
            int productID = 7;
            Product prod1 = new Product(productID, "fanta", 1.50);
        }

        @Test (expected = IllegalArgumentException.class)
        public void ProductNameNull(){
            String productName = null;
            Product prod1 = new Product(7, productName, 1.50);
        }

        @Test
        public void ProductNameSuccessful(){
            String productName = "redbull";
            Product prod1 = new Product(7, productName, 1.50);
        }

        @Test
        public void productPriceDivisibleByNickel(){
            double expectedProductPrice = 3.50;
            Product prod1 = new Product(7, "redbull", 3.50);
            assertEquals(expectedProductPrice, prod1.getPrice(), .001);
        }


        @Test (expected = IllegalArgumentException.class)
        public void productPriceNotDivisibleByNickel() {
            double expectedProductPrice = 1.73;
            Product prod1 = new Product(7, "redbull", expectedProductPrice);
        }

        @Test
        public void productPriceGreaterThanTwoDecimalPlaces() {
            double expectedProductPrice = 1.20;
            Product prod1 = new Product(7, "redbull", 1.204);
            assertEquals(expectedProductPrice, prod1.getPrice(), .001);
    }
}



