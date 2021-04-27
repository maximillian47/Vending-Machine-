package com.personnel;


import com.moneytype.Money;
import com.vendingmachine.InventoryActions;
import com.vendingmachine.WalletActions;

public class Customer implements WalletActions, InventoryActions {
    private String customerID;
    private double custBalance;
    private int nickelCount;
    private int dimeCount;
    private int quarterCount;
    private int oneDollarCount;
    private int fiveDollarCount;
    private int tenDollarCount;

    //Constructors
    public Customer() {
    }

    public Customer(String _customerID, double _custBalance) {
        this.customerID = _customerID;
        this.custBalance = _custBalance;
    }

    //Setter
    public void setNickelCount(int _nickelCount) {
        _nickelCount = (int)randomCash(1,10);
        this.nickelCount = _nickelCount;
    }

    public void setDimeCount(int _dimeCount) {
        _dimeCount = (int)randomCash(1,10);
        this.dimeCount = _dimeCount;
    }

    public void setQuarterCount(int _quarterCount) {
        _quarterCount = (int)randomCash(1,10);
        this.quarterCount = _quarterCount;
    }

    public void setOneDollarCount(int _oneDollarCount) {
        _oneDollarCount = (int)randomCash(1,10);
        this.oneDollarCount = _oneDollarCount;
    }

    public void setFiveDollarCount(int _fiveDollarCount) {
        _fiveDollarCount = (int)randomCash(1,5);
        this.fiveDollarCount = _fiveDollarCount;
    }

    public void setTenDollarCount(int _tenDollarCount) {
        _tenDollarCount = (int)randomCash(1,3);
        this.tenDollarCount = _tenDollarCount;
    }

    private int randomCash(int _min, int _max){
        int randomVal = 0;
        for (int j = 0; j < _max; j++) {
            randomVal = (int) Math.random() * (_max - _min + 1) + _min;
        }
        return randomVal;
    }

    public void setBalance(double _balance) {
        _balance = getDimeCount() * Money.DIME.getValue() + getNickelCount() * Money.NICKEL.getValue() + getQuarterCount()*Money.QUARTER.getValue()
                    + getOneDollarCount()*Money.ONEDOLLAR.getValue() + getFiveDollarCount()*Money.FIVEDOLLAR.getValue() +
                    getTenDollarCount() * Money.TENDOLLAR.getValue();
        custBalance = _balance;
    }

    public void shakeVendingMachine() {

    }

    @Override
    public void pay(double priceToPay) {

    }

    @Override
    public double getBalance() {
        return custBalance;
    }

    @Override
    public void checkInventory() {

    }

    //Getters
    public int getNickelCount() {
        return nickelCount;
    }
    public int getDimeCount() { return dimeCount; }
    public int getQuarterCount() { return quarterCount; }
    public int getOneDollarCount() { return oneDollarCount; }
    public int getFiveDollarCount() { return fiveDollarCount; }
    public int getTenDollarCount() { return tenDollarCount; }

}
