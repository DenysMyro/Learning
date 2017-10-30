package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial implements Action {

    int n;

    private final int ACTIONNUMBER = 3;

    private String description = "Type number to calculate factorial";

    Scanner scan = new Scanner(System.in);

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


    public int getActionNumber() {
        return ACTIONNUMBER;
    }

    public void description() {
        System.out.println(description);

    }

    public void doWork () {

        while (true) {
            String str = scan.nextLine();
            try {
                setN(Integer.parseInt(str));
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Wrong input. Type a number");
            }
        }

        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }

}
