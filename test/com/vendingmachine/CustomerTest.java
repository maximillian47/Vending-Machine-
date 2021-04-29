package com.vendingmachine;

import com.personnel.Customer;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


    private Customer cust1;


    @Test
    public void payThePricePositiveAmount() {
        Customer cust1 = new Customer();
        double expectedOutput = 5.95;
        double actualValue = 5.95;
        cust1.pay(actualValue);
        assertEquals(expectedOutput, cust1.getPriceToPay(), .001);
    }

    @Test
    public void payThePriceNegativeAmount() {
        Customer cust2 = new Customer();
        double expectedOutput = 0;
        double actualValue = -1.95;
        cust2.pay(actualValue);
        assertEquals(expectedOutput, cust2.getPriceToPay(), .001);
    }

    @Test
    public void payThePriceOverBalance() {
        Customer cust3 = new Customer();
        double actualCustomerBalance = cust3.getBalance();
        double expectedCustomerBalance = cust3.getPriceToPay();
        double valueOverPriceToPay = 500;

        cust3.pay(valueOverPriceToPay);

        assertEquals(actualCustomerBalance, expectedCustomerBalance, .001);
    }
}
