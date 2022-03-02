package com.company.question4;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wowsdawof");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooof");
    }
    public void greets(BigDog another) {
        System.out.println("Wooooooooooof");
    }
}
