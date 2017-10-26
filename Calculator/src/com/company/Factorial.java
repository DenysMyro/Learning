package com.company;

public class Factorial extends Action {
    int n;
    String description = "Type digit to calculate factorial";

    public Factorial () {};

    public Factorial (int n) {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int factorial (int n) {
        if(n <=0) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public void doWork () {
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }

}
