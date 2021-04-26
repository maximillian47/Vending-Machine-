package com.vendingmachine;

import com.moneytype.Money;

public class Wallet {
    private double Balance;
    private int nickelCount;
    private int dimeCount;
    private int quarterCount;
    private int oneDollarCount;
    private int fiveDollarCount;
    private int tenDollarCount;

    //Constructor
    public Wallet(double balance, int nickelCount, int dimeCount, int quarterCount, int oneDollarCount, int fiveDollarCount, int tenDollarCount) {
        Balance = balance;
        setNickelCount(nickelCount);
        this.dimeCount = dimeCount;
        this.quarterCount = quarterCount;
        this.oneDollarCount = oneDollarCount;
        this.fiveDollarCount = fiveDollarCount;
        this.tenDollarCount = tenDollarCount;
    }

    //Getters & Setters
    public int getNickelCount() {
        return nickelCount;
    }

    public void setNickelCount(int nickelCountArg) {
        nickelCountArg = (int)randomCash(1,10);
        this.nickelCount = nickelCountArg;
    }

    public int getDimeCount() {
        return dimeCount;
    }

    public void setDimeCount(int dimeCount) {
        this.dimeCount = dimeCount;
    }

    public int getQuarterCount() {
        return quarterCount;
    }

    public void setQuarterCount(int quarterCount) {
        this.quarterCount = quarterCount;
    }

    public int getOneDollarCount() {
        return oneDollarCount;
    }

    public void setOneDollarCount(int oneDollarCount) {
        this.oneDollarCount = oneDollarCount;
    }

    public int getFiveDollarCount() {
        return fiveDollarCount;
    }

    public void setFiveDollarCount(int fiveDollarCount) {
        this.fiveDollarCount = fiveDollarCount;
    }

    public int getTenDollarCount() {
        return tenDollarCount;
    }

    public void setTenDollarCount(int tenDollarCount) {
        this.tenDollarCount = tenDollarCount;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double _balance) {

        Balance = _balance;
    }

    //Methods
    private int randomCash(int _min, int _max){

        int randomVal = 0;
        for (int j = 0; j < _max; j++) {
            randomVal = (int) Math.random() * (_max - _min + 1) + _min;
        }
        return randomVal;

    }
}
