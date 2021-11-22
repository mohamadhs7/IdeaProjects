package com.dotin.depositProject;

public class Deposit {
    private String depositNumber;
    private double amount;
    private DepositState state;

    public Deposit(String depositNumber, double amount, DepositState depositState) {
        this.depositNumber = depositNumber;
        this.amount = amount;
        this.state = depositState;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

       public DepositState getState() {
           return state;
    }
}