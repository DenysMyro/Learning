/**
 * Created by veld on 27.10.2017.
 *
 * Class creates a two-dimensional matrix of a given size from integers
 * and counts the sum of its elements under the main diagonal.
 */

package com.company;

import java.util.Scanner;

public class Matrix implements Action {
    private String description = "Calculation of the sum of matrix elements under the main diagonal";
    int demention;
    int[][] mmm;

    public void description(){
        System.out.println(description);
        setDemention();
    }

    public int getDemention() {
        return demention;
    }

    public void setDemention() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the size of the two-dimension matrix");
            String str = scan.nextLine();
            try {
                this.demention = Integer.parseInt(str);
                if (demention < 2) {
                    throw new NumberFormatException("Wrong input. Size must be more than 1");
                }
                break;
            }
            catch (NumberFormatException ex){
                System.out.println("Wrong input. Size must be number more than 1");
            }
        }
    }

    public int[][] createMatrix (int demention) {
        Scanner scan = new Scanner(System.in);
        int[][] mm = new int[demention][demention];
        for (int i = 0; i < demention; i++) {
            for (int j = 0; j < demention; j++) {

                while (true) {
                    System.out.println("Enter the element of matrix A[" + i + "," + j + "]");
                    String str = scan.nextLine();
                    try {
                        mm[i][j] = Integer.parseInt(str);
                        break;
                    }
                    catch (NumberFormatException exx){
                        System.out.println("Wrong input. Element A[" + i + "," + j + "] must be number");
                    }
                }
            }
        }
        return mm;
     }

    public void printMatrix (int [][] mm) {
        System.out.println( demention + "x" + demention + " matrix ");
        for (int i = 0; i < demention; i++) {
            for (int j = 0; j < demention; j++) {
                System.out.print("A[" + i + "," + j + "]=" + mm[i][j] + "        ");
            }
            System.out.println();
        }
    }

    public int sumMatrix (int [][] mm) {
        int sum = 0;
        for (int i = 0; i < demention; i++) {
            for (int j = 0; j < demention; j++) {
                if (i > j) {
                    sum+=mm[i][j];
                }
            }
        }
        return sum;
    }

    //@Override
    public void doWork() {
        mmm = createMatrix(demention);
        printMatrix(mmm);
        System.out.println("Sum is: " + sumMatrix(mmm));
    }
}
