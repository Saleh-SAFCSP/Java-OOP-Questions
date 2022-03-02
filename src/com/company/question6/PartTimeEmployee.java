package com.company.question6;

public class PartTimeEmployee  extends  Employee{

    private int workHours;
    private int wage;

    public PartTimeEmployee(int id, String name, int workHours, int wage) {
        super(id, name);
        this.workHours = workHours;
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public double computeAmount() {
        return workHours*wage;
    }


}
