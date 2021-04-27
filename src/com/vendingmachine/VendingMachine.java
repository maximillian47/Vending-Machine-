package com.vendingmachine;

import com.personnel.Customer;

public interface VendingMachine {
    default void refundChange(){
        if (moneyPaid < totalProductCost) {
            Customer.custbalance += moneyPaid;
        }
    };
}
