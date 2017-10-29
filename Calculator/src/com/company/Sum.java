package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum implements Action {

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

    public void description() {
        System.out.println(description);
        while (true) {
            setA(Integer.parseInt(scan.next()));
            setB(Integer.parseInt(scan.next()));
        }
    }

    public void doWork () {
        System.out.println("Sum is: "+(a+b));
    }
}
