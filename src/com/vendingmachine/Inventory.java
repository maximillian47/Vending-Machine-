package com.vendingmachine;
import com.personnel.Customer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Inventory implements VendingMachine{


    private int selectedProductID;
    private double pricePaid;

    Inventory() {

    }


    private static HashMap<Integer, Product> inventory = new LinkedHashMap<>();
    static { //ProductID is the Key, Product is Value
        inventory.put(1, new Product(1, "Coca-Cola", 2.50));
        inventory.put(2, new Product(2, "Water", 1.00));
        inventory.put(3, new Product(3, "Orange Juice", 2.00));
        inventory.put(4, new Product(4,"Red Bull", 4.00));
        inventory.put(5, new Product(5, "Snickers", 1.50));
        inventory.put(6, new Product(6, "Reeses's Peanut Butter Cup", 1.75));
    }

    public HashMap<Integer, Product>  getInventory() {
        for (Map.Entry entry: inventory.entrySet()) {
            System.out.println(entry.getKey() + " Quantity: " + entry.getValue());
        }
        return inventory;
    }

    private HashMap<Integer, Integer> stockQuantity = new LinkedHashMap<>();

    {//ProductID is the Key, Quantity is Value
        stockQuantity.put(1, 10);
        stockQuantity.put(2, 10);
        stockQuantity.put(3, 10);
        stockQuantity.put(4, 10);
        stockQuantity.put(5, 15);
        stockQuantity.put(6, 15);
    }




//    public void setProductID(int _productID) {
//        selectedProductID = _productID;
//    }

    public int getProductID() {
        return selectedProductID;
    }

    public void collectPay(double _pricePaid) {
        pricePaid = _pricePaid;
    }


    @Override
    public Product selectProduct(int _selectedProductID) {
        inventory.get()
        selectedProductID =getProductID();
    }



    @Override
    public void dispenseProduct() {

    }

    @Override
    public void refundChange(double pricePaid){
        if (pricePaid < totalProductCost) {
            Customer.getBalance() += moneyPaid;
        }
    };

    public static void main(String[] args) {
        Inventory inventory1 = new Inventory();
        inventory1.getInventory();
    }


}
