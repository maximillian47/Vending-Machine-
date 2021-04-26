package com.vendingmachine;

import com.moneytype.Money;

public class Wallet {
    private double balance;
    private int nickelCount;
    private int dimeCount;
    private int quarterCount;
    private int oneDollarCount;
    private int fiveDollarCount;
    private int tenDollarCount;

    //Constructor
    public Wallet(double balance, int nickelCount, int dimeCount, int quarterCount, int oneDollarCount, int fiveDollarCount, int tenDollarCount) {
        setBalance(balance);
        setNickelCount(nickelCount);
        setDimeCount(dimeCount);
        setQuarterCount(quarterCount);
        setOneDollarCount(oneDollarCount);
        setFiveDollarCount(fiveDollarCount);
        setTenDollarCount(tenDollarCount);
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

    public void setDimeCount(int dimeCountArg) {
        dimeCountArg = (int)randomCash(1,10);
        this.dimeCount = dimeCountArg;
    }

    public int getQuarterCount() {
        return quarterCount;
    }

    public void setQuarterCount(int quarterCountArg) {
        quarterCountArg = (int)randomCash(1,10);
        this.quarterCount = quarterCountArg;
    }

    public int getOneDollarCount() {
        return oneDollarCount;
    }

    public void setOneDollarCount(int oneDollarCountArg) {
        oneDollarCountArg = (int)randomCash(1,10);
        this.oneDollarCount = oneDollarCountArg;
    }

    public int getFiveDollarCount() {
        return fiveDollarCount;
    }

    public void setFiveDollarCount(int fiveDollarCountArg) {
        fiveDollarCountArg = (int)randomCash(1,10);
        this.fiveDollarCount = fiveDollarCountArg;
    }

    public int getTenDollarCount() {
        return tenDollarCount;
    }

    public void setTenDollarCount(int tenDollarCountArg) {
        tenDollarCountArg = (int)randomCash(1,10);
        this.tenDollarCount = tenDollarCountArg;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double _balance) {

        balance = _balance;
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
