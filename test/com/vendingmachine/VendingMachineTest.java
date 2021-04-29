package com.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine vendingMachine1;

    @Before
    public void setUp() throws Exception {
        vendingMachine1 = new VendingMachine();
    }

    @Test
    public void selectProductCustomerChangeSuccess() {
        vendingMachine1.setPricePaid(10);
       vendingMachine1.selectProduct(2);
       double expectedCustomerChange = 9;

       assertEquals(expectedCustomerChange,vendingMachine1.getCustomerChange(), 0.001);
    }

    @Test
    public void selectProductCustomerInsufficientPay() {
        vendingMachine1.setPricePaid(1);
        vendingMachine1.selectProduct(1);
        double expectedCustomerChange = 1;

        assertEquals(expectedCustomerChange,vendingMachine1.getCustomerChange(), 0.001);
    }

    @Test
    public void selectProductSuccessInStockDecrement() {

        vendingMachine1.setPricePaid(2);
        vendingMachine1.selectProduct(2);
        double expectedStockQuantity = 9;
        double actualStockQuantity = vendingMachine1.getStockQuantity().get(2);

        assertEquals(expectedStockQuantity,actualStockQuantity, 0.001);
    }
    @Test
    public void selectProductNoStock() {

        vendingMachine1.setPricePaid(2);
        vendingMachine1.selectProduct(3);
        double expectedStockQuantity = 0;
        double actualStockQuantity = vendingMachine1.getStockQuantity().get(3);

        assertEquals(expectedStockQuantity,actualStockQuantity, 0.001);
    }
}