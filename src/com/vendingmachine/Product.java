package com.vendingmachine;

import java.util.Objects;

public class Product {
    private int productID;
    private String productName;
    private double price;



    //Constructor
    public Product(int productID, String productName, double price) {
        setProductID(productID);
        setProductName(productName);
        setPrice(price);
    }

    //Getters & Setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) throws IllegalArgumentException {
        if (productID > 0) {
            this.productID = productID;
        } else {
            throw new IllegalArgumentException("Product ID must be positive integer");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) throws IllegalArgumentException{
        if(productName == null) {
            throw new IllegalArgumentException("Product name cannot be null");
        } else if (productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Please give product a name");
        } else {
            this.productName = productName;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double priceArg) throws IllegalArgumentException{
        double truncatedPriceArg = Math.floor(priceArg * 100)/100;  //Truncate inputs to 2 decimal places

        int intPriceArg = (int) (priceArg*100);
        if ((priceArg>0.0) && (intPriceArg%5 == 0)) {  //Check to make sure price is divisible by 0.05 cents
            this.price = truncatedPriceArg;
        } else {
            throw new IllegalArgumentException("Price must be more than 0.");
        }
    }

    @Override
    public String toString() {
        return "# "+ productID +
                ". " + productName + " Cost: " +
                 " $"+ price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Double.compare(product.price, price) == 0 && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productName, price);
    }
}