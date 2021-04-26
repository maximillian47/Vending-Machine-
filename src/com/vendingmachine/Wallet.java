package com.vendingmachine;

import com.moneytype.Money;

public class Wallet {
    private double Balance;
    private int NickelCount;
    private int DimeCount;
    private int QuarterCount;
    private int OneDollarCount;
    private int FiveDollarCount;
    private int TenDollarCount;

    public int getNickelCount() {
        return NickelCount;
    }

    public void setNickelCount(int _nickelCount) {
        int max = 10;
        int min = 1;
        int randomVal = 0;
        for (int j = 0; j < max; j++) {
            randomVal = (int) Math.random() * (max - min + 1) + min;
        }
        _nickelCount = randomVal;
        NickelCount = _nickelCount;
    }

    public int getDimeCount() {
        return DimeCount;
    }

    public void setDimeCount(int _dimeCount) {
        int max = 10;
        int min = 1;
        int randomVal = 0;
        for (int j = 0; j < max; j++) {
            randomVal = (int) Math.random() * (max - min + 1) + min;
        }
        _dimeCount = randomVal;
        DimeCount = _dimeCount;
    }

    public int getQuarterCount() {
        return QuarterCount;
    }

    public void setQuarterCount(int _quarterCount) {
        int max = 10;
        int min = 1;
        int randomVal = 0;
        for (int j = 0; j < max; j++) {
            randomVal = (int) Math.random() * (max - min + 1) + min;
        }
        _quarterCount = randomVal;
        QuarterCount = _quarterCount;
    }

    public int getOneDollarCount() {
        return OneDollarCount;
    }

    public void setOneDollarCount(int _oneDollarCount) {
        int max = 10;
        int min = 1;
        int randomVal = 0;
        for (int j = 0; j < max; j++) {
            randomVal = (int) Math.random() * (max - min + 1) + min;
        }
        _oneDollarCount = randomVal;
        OneDollarCount = _oneDollarCount;
    }

    public int getFiveDollarCount() {
        return FiveDollarCount;
    }

    public void setFiveDollarCount(int _fiveDollarCount) {
        int max = 10;
        int min = 1;
        int randomVal = 0;
        for (int j = 0; j < max; j++) {
            randomVal = (int) Math.random() * (max - min + 1) + min;
        }
        _fiveDollarCount = randomVal;
        FiveDollarCount = _fiveDollarCount;
    }

    public int getTenDollarCount() {
        return TenDollarCount;
    }

    public void setTenDollarCount(int _tenDollarCounter) {
        int max = 3;
        int min = 1;
        int randomVal = 0;
        for (int j = 0; j < max; j++) {
            randomVal = (int) Math.random() * (max - min + 1) + min;
        }
        _tenDollarCounter = randomVal;
        TenDollarCount = _tenDollarCounter;
    }



    public double getBalance() {
        return Balance;
    }

    public void setBalance(double _balance) {




        Balance = _balance;
    }


}
