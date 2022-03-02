package com.company.question8;

import java.text.DecimalFormat;

public class Account {

    private int ID;
    private  Customer customer;
    private double balance;

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");

        return "Account{" +
                "ID=" + ID +
                ", customer=" + customer +
                ", balance=" + df.format( balance) +
                '}';
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
         balance=balance+amount;
         return  this;
    }

    public Account withdraw(double amount){
        if(balance>= amount) {
            balance = balance - amount;
        }else {
            System.out.println("You don't have balance to withdraw");
        }
        return  this;
    }
}
