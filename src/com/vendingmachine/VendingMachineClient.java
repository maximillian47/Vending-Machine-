package com.vendingmachine;
import com.personnel.Customer;

import java.util.*;

public class VendingMachineClient {
    public static void main(String[] args) {


        Inventory vendingInventory = new Inventory();
        Customer customer = new Customer();


        System.out.println("Midlife Crisis Vending Machines!");
        vendingInventory.getInventory();
        System.out.println("\n");

        System.out.println("Customer Wallet Balance: $" + customer.getBalance());


        double customerPaid = 0;
        Scanner inputPayment = new Scanner(System.in);
        System.out.println("Please input payment amount: ");
        while (true) {

            try {
                customerPaid = Double.parseDouble(inputPayment.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Please input payment amount: ");

            }
        }
        customer.pay(customerPaid);
        vendingInventory.collectPay(customerPaid);

        System.out.println("You have " + customer.getPriceToPay() + " credit.");
        System.out.println("Please make selection:");
        Scanner inputSelection = new Scanner(System.in);
        try {
            int productNum = (int) inputSelection.nextDouble();
            vendingInventory.selectProduct(productNum);

        } catch (IllegalArgumentException iae) {
            System.out.println(iae + "Please select a product.");
        }



    }
}
