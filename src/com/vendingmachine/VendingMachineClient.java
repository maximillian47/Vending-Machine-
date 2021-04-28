package com.vendingmachine;
import com.personnel.Customer;

import java.util.*;

public class VendingMachineClient {
    public static void main(String[] args) {


        Inventory vendingInventory = new Inventory();
        Customer customer = new Customer();

        do {
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
                    System.out.println(" Please input payment amount: ");

                }
            }

            vendingInventory.collectPay(customerPaid);
            customer.pay(customerPaid);
            System.out.println("You have " + customer.getPriceToPay() + " credit.");


            Scanner inputSelection = new Scanner(System.in);
            System.out.println("Please make selection:");

            int productNum = 0;
            while(true) {
                try {
                    productNum = Integer.parseInt(inputSelection.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println(" Please select a product: ");
                }
            }
            vendingInventory.selectProduct(productNum);
            customer.updateBalance(vendingInventory.getInventory().get(productNum).getPrice()); //subtract product price from custBalance
        } while (customer.getBalance() > 0);
    }
}
