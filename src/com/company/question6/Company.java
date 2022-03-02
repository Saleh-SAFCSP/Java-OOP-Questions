package com.company.question6;

import java.util.ArrayList;

public class Company {

    private ArrayList<Payable> payables;
    private String name;

    public Company(String name) {
        this.name = name;
        this.payables = new ArrayList<>();
    }

    public boolean add(Payable p){
        return payables.add(p);
    }

    public double computeAmount(){
        double total=0;
        for (int i = 0; i < payables.size(); i++) {
            total+=payables.get(i).computeAmount();
        }
     return total;
    }

    @Override
    public String toString() {
        return "Company{" +
                "payables=" + payables +
                ", name='" + name + '\'' +
                '}';
    }
}
