package com.dotin.depositProject;

import javax.persistence.*;

@Entity
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Origin")
    private String depositNumberOrigin;
    @Column(name = "Destination")
    private String depositNumberDestination;
    private double amount;

    public Transaction(String depositNumberOrigin, String depositNumberDestination, double amount) {
        this.depositNumberOrigin = depositNumberOrigin;
        this.depositNumberDestination = depositNumberDestination;
        this.amount = amount;
    }

    public Transaction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepositNumberOrigin() {
        return depositNumberOrigin;
    }

    public void setDepositNumberOrigin(String depositNumberOrigin) {
        this.depositNumberOrigin = depositNumberOrigin;
    }

    public String getDepositNumberDestination() {
        return depositNumberDestination;
    }

    public void setDepositNumberDestination(String depositNumberDestination) {
        this.depositNumberDestination = depositNumberDestination;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
