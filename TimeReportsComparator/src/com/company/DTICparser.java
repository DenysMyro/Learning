package com.company;

import java.io.*;

public class DTICparser {


    public static void main(String[] args) {

        String csvFile = "C:\\IdeaProjects\\Learning\\TimeReportsComparator\\October.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String[][] reportTable = new String[8][30];
        int lineCounter = 0;

        //Read file and put it to 2d arr
        try {
            br = new BufferedReader(new FileReader(csvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("NOFILE!");
        }
        try {
            while ((line = br.readLine()) != null) {
                String[] tmpArr = line.split(cvsSplitBy);
                for (int j = 0; j < tmpArr.length; j++) {
                    reportTable[lineCounter][j] = tmpArr[j];
                }
                lineCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < reportTable.length; i++) {
            for (int j = 0; j < reportTable[i].length; j++) {
                System.out.print(" " + reportTable[i][j]);
            }
            System.out.println();
        }
    }


    public void printTable() {

    }

    public String getName(int row) {
        return null;//reportTable[row][1];
    }

    public double getHours(int row) {
        return 0.0;
    }

    public String gerProjectName(int row) {
        /* we need to retrieve 18 digits code from the end of the string
        * do manual check with 20 digits to see if all codes are fit to standard
        * found one exception 17 digits project 401AA010202061B20*/

        return null;
    }


}


