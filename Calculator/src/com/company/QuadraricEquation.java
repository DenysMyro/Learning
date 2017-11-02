package com.company;

import com.company.Action;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by serg on 01.11.2017.
 */
public class QuadraricEquation  implements Action {

    private final int ACTIONNUMBER = 1;

    double a, b, c;

    private String description = "Enter three digits separated by space to get quadratic equation";

    Scanner scan = new Scanner(System.in);

    public QuadraricEquation() {
    }

    public QuadraricEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {

    }

    public int getActionNumber() {
        return ACTIONNUMBER;
    }

    public void description() {
        System.out.println(description);
    }

    public void doWork() {
        while (true) {
            try {
                a = Double.parseDouble(scan.next());
                b = Double.parseDouble(scan.next());
                c = Double.parseDouble(scan.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input. " + description);
            }
        }
        System.out.println(result(a, b, c));
    }

    public String result(double a, double b, double c) {
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return "Roots of equation: x1 = " + x1 + ", x2 = " + x2;
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            return "The equation has only one root: x = " + x;
        } else {
            return "The equation has no root!";
        }
    }
}
