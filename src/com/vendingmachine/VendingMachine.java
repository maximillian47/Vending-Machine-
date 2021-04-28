package com.vendingmachine;


public interface VendingMachine {

    Product selectProduct(int _selectedProductID);
    void dispenseProduct();
    void refundChange();

}
