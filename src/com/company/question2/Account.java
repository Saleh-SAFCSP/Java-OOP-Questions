package com.company.question2;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id,String name){
           this.id=id;
            this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount){
        balance=balance+amount;
    }
    public void debit(int amount){
        balance=balance-amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
