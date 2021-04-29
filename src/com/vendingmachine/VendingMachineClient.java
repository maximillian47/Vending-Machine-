package com.vendingmachine;
import com.personnel.Customer;


import java.util.*;

public class VendingMachineClient {
    public static void main(String[] args) {


        VendingMachine vendingInventory = new VendingMachine();
        Customer customer = new Customer();

        do {
            System.out.println("Midlife Crisis Vending Machines!");

            vendingInventory.displayInventory();
            System.out.println("\n");

            System.out.println("Customer Wallet Balance: $" + customer.getBalance());

            
            vendingInventory.collectPay(vendingInventory.getPricePaid());
            customer.pay(vendingInventory.getPricePaid());
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
