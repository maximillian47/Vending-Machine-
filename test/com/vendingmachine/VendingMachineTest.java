package com.vendingmachine;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

    private VendingMachine vendingMachine1;

    @Before
    public void setUp() throws Exception {
        VendingMachine vendingMachine1 = new VendingMachine();
    }
//
//    @Test
//    public void collectPaySuccess() {
//        double actualPricePaid = 4;
//        vendingMachine1.collectPay(actualPricePaid);
//        assertEquals(actualPricePaid, );
//    }

//    @Test
//    public void collectPayFail() {
//        double actualPricePaid = -3;
//        vendingMachine1.collectPay(actualPricePaid);
//
//    }

//    @Test (expected = IllegalArgumentException.class)
//    public void collectPayFail() {
//        VendingMachine vendingMachine1 = new VendingMachine();
//
//        vendingMachine1.collectPay(-3);
//        throw exceptionRule;
//    }


    @Test
    public void selectProductSuccess() {
       vendingMachine1.collectPay(5);
       int expectedSelectedProduct = 1;
       vendingMachine1.selectProduct(expectedSelectedProduct);
//       int actualSelectProduct = vendingMachine1.
    }

//    @Test
//    public void selectProduct() {
//    }
//
//    @Test
//    public void selectProduct() {
//    }
}