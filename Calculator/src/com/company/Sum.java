package com.company;

public class Sum extends Action {

    int a, b;

    public String description = "Enter two digits separated by space to get sum";

    public Sum () {

    }

    public Sum (int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }


    public void doWork () {
        System.out.println("Sum is: "+(a+b));
    }
}
