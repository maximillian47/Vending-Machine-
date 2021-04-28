package com.vendingmachine;
import com.personnel.Customer;

import java.util.*;

public class VendingMachineClient {
    public static void main(String[] args) {
        Scanner selectionInput = new Scanner(System.in);

        Inventory vendingInventory = new Inventory();
        Customer customer = new Customer();

        System.out.println(customer.randomCash(15));

        System.out.println("Midlife Crisis Vending Machines!");
        vendingInventory.getInventory();
        System.out.println("\n");

        System.out.println("Customer Wallet Balance: " + customer.getBalance());


        double customerPaid = 0;

        while (true) {
            System.out.println("Please input payment amount: ");

            try {
                customerPaid = Double.parseDouble(selectionInput.next());
                break;
            } catch (InvalidSelectionException ise) {
                System.out.println("Please input payment amount: ");
            }
        }
            customer.pay(customerPaid);
            System.out.println("You have " + customer.getPriceToPay() + " credit.");
            System.out.println("Please make selection:");

            try {
                int productNum = (int) selectionInput.nextDouble();
                vendingInventory.selectProduct(productNum);

            } catch (IllegalArgumentException iae) {
                System.out.println(iae + "Please select a product.");
            }
            


    }
}
