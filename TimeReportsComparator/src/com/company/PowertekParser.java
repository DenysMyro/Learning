package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PowertekParser {


    private String csvFile;
    private BufferedReader br = null;
    private String line = "";
    private String cvsSplitBy;
    private String[][] reportTable;
    private int lineCounter = 0;


    public PowertekParser(String csvFilePath, String cvsSplitBy, int maxRows, int maxColumns) {
        this.csvFile = csvFilePath;
        this.cvsSplitBy = cvsSplitBy;
        //create report table
        reportTable = new String[maxRows][maxColumns];//needs to be improved

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
    }


    public void printTable() {
        for (int i = 0; i < reportTable.length; i++) {
            for (int j = 0; j < reportTable[i].length; j++) {
                System.out.print("|" + reportTable[i][j]);
            }
            System.out.println();
        }
    }

    public String getName(int row) {
        return reportTable[row][1];
    }

    public double getHours(int row) {
        if (isBillable(row))
            return Double.parseDouble(reportTable[row][4].replace(",", "."));//replace done to avoid java.lang.NumberFormatException: For input string: "2,5"
        return 0.0;
    }

    public String gerProjectName(int row) {
        /* we need to retrieve 18 digits code from the end of the string
        * do manual check with 20 digits to see if all codes are fit to standard
        * found one exception 17 digits project 401AA010202061B20
        * UPD: 17 CODE is a mistake(last symbol missing) correct code is 401AA010202061B201*/

        String substr = reportTable[row][7].replace(" ", "").replace("-", "").replace(".", "");
        if (substr.length() > 20) {
            if (substr.contains("401AA010202061B20"))//handling mistake
                return "401AA010202061B201";
            return substr.substring(substr.length() - 18);
        }
        return null;
    }

    public int getLineCounter() {
        return lineCounter;
    }

    public boolean isBillable(int row) {
        return reportTable[row][5].toLowerCase().contains("yes");
    }
}
