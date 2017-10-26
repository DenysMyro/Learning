package com.company;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static boolean isActive = true;
    static int select = 0;



    public static void main(String[] args) {

	    while (isActive) {
	       try {
               showMenu();
           } catch (InputMismatchException e ) {
               System.out.println("Wrong input. Type only digits");
           }
        }
    }
    public static void showMenu () {
        System.out.println();
        System.out.println("Welcome to calculate program! Select action by taping action number");
        System.out.println("1. Calculate quadratic equation ");
        System.out.println("2. Calculate Sum of diagonal of the matrix ");
        System.out.println("3. Calculate factorial");
        System.out.println("4. Calculate the sum");
        System.out.println("5. Exit");

        Scanner scan = new Scanner(System.in);

        select = scan.nextInt();

        switch (select) {

            case 1:
                System.out.println("not implemented yet");
                showMenu();
                break;
            case 2:
                System.out.println("not implemented yet");
                break;
            case 3:
                Factorial fac = new Factorial();
                System.out.println(fac.description);
                fac.setN(scan.nextInt());
                fac.doWork();
                showMenu();
                break;
            case 4:
                Sum sum = new Sum();
                System.out.println(sum.description);
                sum.setA(scan.nextInt());
                sum.setB(scan.nextInt());
                sum.doWork();
                showMenu();
                break;
            default:
                System.out.println("Exit");
                isActive = false;
                break;

        }
    }
}
