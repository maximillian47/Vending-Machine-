package com.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    private  Inventory inventory1;

    @Before
    public void setUp() throws Exception {
        Inventory inventory1 = new Inventory();
    }
//
//    @Test
//    public void collectPaySuccess() {
//        double actualPricePaid = 4;
//        inventory1.collectPay(actualPricePaid);
//        assertEquals(actualPricePaid, );
//    }

//    @Test
//    public void collectPayFail() {
//        double actualPricePaid = -3;
//        inventory1.collectPay(actualPricePaid);
//
//    }




    @Test
    public void selectProductSuccess() {
       inventory1.collectPay(5);
       int expectedSelectedProduct = 1;
       inventory1.selectProduct(expectedSelectedProduct);
       int actualSelectProduct = inventory1.
    }

    @Test
    public void selectProduct() {
    }

    @Test
    public void selectProduct() {
    }
}