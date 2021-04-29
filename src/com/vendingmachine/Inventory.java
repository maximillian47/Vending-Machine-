package com.vendingmachine;
import com.personnel.Customer;

import java.util.*;

public class Inventory implements VendingMachine{



    private double pricePaid;



    private double customerChange = 0;

    public Inventory() {

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
        return inventory;
    }

    public void displayInventory() {
        for (int i=1; i< inventory.size()+1; i++) {
            System.out.println(inventory.get(i) + " [Quantity: "  + stockQuantity.get(i) + "]");
        }
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


    public void collectPay(double _pricePaid) {
        boolean reEnter = true;

        Scanner inputPay = new Scanner(System.in);

        while( reEnter) {
            try {
                System.out.println("Please input payment amount: ");
                _pricePaid = Double.parseDouble(inputPay.nextLine());
                pricePaid = _pricePaid;
                reEnter = false;
                if (_pricePaid <= 0.0) {
                    throw new IllegalArgumentException("Payment must be a positive number!");
                }

            } catch (IllegalArgumentException i) {
                System.out.println("Please enter a positive amount to pay for the item...");
                reEnter = true;
            }
        }
    }

    public double getPricePaid() {
        return pricePaid;
    }



    public double getCustomerChange() {
        return customerChange;
    }

    @Override
    public void selectProduct(int _selectedProductID) {
        if (pricePaid < inventory.get(_selectedProductID).getPrice()) {
            customerChange = pricePaid;
            System.out.println("Insufficient fund, refund issued: " + getCustomerChange());

        } else if (pricePaid>=inventory.get(_selectedProductID).getPrice() && stockQuantity.get(_selectedProductID)>0) {
            stockQuantity.replace(_selectedProductID, stockQuantity.get(_selectedProductID)-1);
            customerChange = pricePaid - inventory.get(_selectedProductID).getPrice();
            System.out.println("You have purchased one " + inventory.get(_selectedProductID).getProductName());
            System.out.println(stockQuantity.get(_selectedProductID) + " remaining.");
            System.out.println("Here is your change: $" + getCustomerChange());
            System.out.println();
           } else if (stockQuantity.get(_selectedProductID)<=0) {
            customerChange = pricePaid;
            System.out.println(inventory.get(_selectedProductID).getProductName() +" is out of stock. Please select another item!");
            System.out.println("Refund issued: "+ getCustomerChange());
        }
    }


//    public static void main(String[] args) {
//        Inventory inventory1 = new Inventory();
//        inventory1.getInventory();
//    }


}
