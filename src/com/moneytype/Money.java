package com.moneytype;

public enum Money {
    NICKLE(0.05), DIME(0.10), QUARTER(0.25), ONEDOLLAR(1.0), FIVEDOLLAR(5.0), TENDOLLAR(10);
    private double value;
    private Money(double value) {
        this.value = value; }

}
