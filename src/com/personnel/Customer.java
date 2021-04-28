package com.personnel;


import com.moneytype.Money;

import java.util.Random;

public class Customer {
    private double custBalance;
    private int nickelCount;
    private int dimeCount;
    private int quarterCount;
    private int oneDollarCount;
    private int fiveDollarCount;
    private int tenDollarCount;
    private double priceToPay;

    //Constructors

    public Customer() {
        setBalance();
    }

    //Setter
    public void setBalance() { //One setter to rule them all

        nickelCount = randomCash(10);
        double nickelValue = nickelCount * Money.NICKEL.getValue();
        dimeCount = randomCash(10);
        double dimeValue = dimeCount * Money.DIME.getValue();
        quarterCount = randomCash(10);
        double quarterValue = quarterCount * Money.QUARTER.getValue();
        oneDollarCount = randomCash(10);
        double oneDollarValue = oneDollarCount * Money.ONEDOLLAR.getValue();
        fiveDollarCount = randomCash(5);
        double fiveDollarValue = fiveDollarCount * Money.FIVEDOLLAR.getValue();
        tenDollarCount = randomCash(3);
        double tenDollarValue = tenDollarCount * Money.TENDOLLAR.getValue();

        double _balance = nickelValue+dimeValue+quarterValue+oneDollarValue+fiveDollarValue+tenDollarValue;
        custBalance = _balance;
    }

    // Business Methods
    public int randomCash(int count){
        Random rand = new Random();
        return rand.nextInt(count)+1;
    }


    public void pay(double priceToPayArg) {
        double truncatedPriceArg = Math.floor(priceToPayArg * 100)/100;
        if (truncatedPriceArg>0) {
            priceToPay = truncatedPriceArg;
        }
    }

    public double getPriceToPay() {
        return priceToPay;
    }

    public void updateBalance(double change){
        custBalance = custBalance-change;
    }

    public double getBalance() {
        return custBalance;
    }


}
