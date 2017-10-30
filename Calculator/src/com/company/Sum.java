package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum implements Action {

    private final int ACTIONNUMBER = 4;

    int a, b;

    private String description = "Enter two digits separated by space to get sum";

    Scanner scan = new Scanner(System.in);

    public Sum () {};

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

    public int getActionNumber() {
        return ACTIONNUMBER;
    }

    public void description() {
        System.out.println(description);
    }

    public void doWork () {
        while (true) {
            try {
                a = Integer.parseInt(scan.next());
                b = Integer.parseInt(scan.next());
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Wrong input");
            }
        }
        System.out.println("Sum is: "+(a+b));
    }
}
