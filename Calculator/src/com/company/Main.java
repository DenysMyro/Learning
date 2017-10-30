package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isActive = true;
    static int select = 0;

    static Scanner scan = new Scanner(System.in);
    static Matrix mm = new Matrix();
    static Factorial fac = new Factorial();
    static Sum sum = new Sum();

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

        Action[] list = {mm, fac, sum};

        for (Action item : list
                ) {
            if (item.getActionNumber() == select) {
                item.description();
                item.doWork();
            } else {
                if (select == 5) {
                    System.out.println("Exit");
                    isActive = false;
                    break;
                }
//                else {
//                    System.out.println("Action is not available"+"\n");
//                    break;

//                }
            }
        }
    }
}
