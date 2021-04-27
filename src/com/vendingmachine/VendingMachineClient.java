package com.vendingmachine;
import java.util.*;

public class VendingMachineClient {
    public static void main(String[] args) {

        Inventory vendingInventory = new Inventory();
        System.out.println("Please make your selection:");
        vendingInventory.getInventory();

        Scanner selectionInput = new Scanner(System.in);


        int productNum = (int) selectionInput.nextDouble();
        vendingInventory.selectProduct(productNum);


        vendingInventory.dispenseProduct();
        


    }
}
