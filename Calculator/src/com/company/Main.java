package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static boolean isActive = true;
    static int select = 0;

    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {

	    while (isActive) {
        try {
            showMenu();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input. Type only digits");
            }
        }
    }
    public static void showMenu () {
        System.out.println();
        System.out.println("Welcome to calculator program! Select action by taping action number");
        System.out.println("1. Calculate quadratic equation ");
        System.out.println("2. Calculate Sum of diagonal of the matrix ");
        System.out.println("3. Calculate factorial");
        System.out.println("4. Calculate the sum");
        System.out.println("5. Exit");

        select = Integer.parseInt(scan.next());

        switch (select) {

            case 1:
                System.out.println("not implemented yet");
                break;
            case 2:
                Matrix mm = new Matrix();
                mm.description();
                mm.doWork();
                break;
            case 3:
                Factorial fac = new Factorial();
                fac.description();
                fac.doWork();
                break;
            case 4:
                Sum sum = new Sum();
                sum.description();
                sum.doWork();
                break;
            default:
                System.out.println("Exit");
                isActive = false;
                break;
        }
    }
}
