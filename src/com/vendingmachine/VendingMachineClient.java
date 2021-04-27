package com.vendingmachine;
import java.util.*;

public class VendingMachineClient {
    public static void main(String[] args) {

        Inventory inventory1 = new Inventory();


        Scanner selectionInput = new Scanner(System.in);
        double productNum;
        productNum = selectionInput.nextDouble();
        inventory1.selectProduct(productNum);

        


    }
}
