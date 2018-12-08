package com.company;

import java.io.*;

public class DTICparser {

    /**
     * Add new csv file each time, extract data to Time tracking Sys and then add new file again
     */

    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ";";
    String[][] reportTable;
    int lineCounter = 0;


    public void addSheet(String csvFilePath) {
        reportTable = new String[15][30]; //clear table with creating new

        //Read file and put it to 2d arr
        try {
            br = new BufferedReader(new FileReader(csvFilePath));
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
    }

    public void printTable() {
        for (int i = 0; i < reportTable.length; i++) {
            for (int j = 0; j < reportTable[i].length; j++) {
                System.out.print("|" + reportTable[i][j]);
            }
            System.out.println();
        }
    }

    public String getName() {
        String name = reportTable[3][0];
        if (!name.isEmpty()) {
            String[] tmp = name.split(",");
            name = tmp[1].replace(" ", "") + " " + tmp[0];
            return name;
        }
        return null;
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


