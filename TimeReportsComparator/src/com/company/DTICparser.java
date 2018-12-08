package com.company;

import java.io.*;

public class DTICparser {

    /**
     * Add new csv file each time, data will be extracted automatically with  processSheet() and record Name, Project, Time well be parsed to final Report
     * After all CSV sheets are added, use final report will be used to fill Time Tracking System
     */

    private BufferedReader br = null;
    private String line = "";
    private String cvsSplitBy = ";";
    private String[][] tmpTable;
    private String[][] finalReport = new String[100][3];/// todo smart way
    private int finTableLineCounter = 0;//needed to write new entries on LAST position


    public void addSheet(String csvFilePath) {
        tmpTable = new String[30][30]; //clear table with creating new
        int lineCounter = 0;
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
                    tmpTable[lineCounter][j] = tmpArr[j];
                }
                lineCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        processSheet();
    }

    public void printTmpTable() {
        for (int i = 0; i < tmpTable.length; i++) {
            for (int j = 0; j < tmpTable[i].length; j++) {
                System.out.print("|" + tmpTable[i][j]);
            }
            System.out.println();
        }
    }
    public void printFinalReport() {
        for (int i = 0; i < finalReport.length; i++) {
            for (int j = 0; j < finalReport[i].length; j++) {
                System.out.print("|" + finalReport[i][j]);
            }
            System.out.println();
        }
    }

    private String getName() {
        String name = tmpTable[3][0];
        if (!name.isEmpty()) {
            String[] tmp = name.split(",");
            name = tmp[1].replace(" ", "") + " " + tmp[0];
            return name;
        }
        return null;
    }

    private String getProjectName(int row) {
        /* we need to retrieve 18 digits code from the end of the string
        * do manual check with 20 digits to see if all codes are fit to standard
        * found one exception 17 digits project 401AA010202061B20
        * UPD: 17 CODE is a mistake(last symbol missing) correct code is 401AA010202061B201*/

        String substr = tmpTable[row][4].replace(" ", "").replace("-", "").replace(".", "");
        ;
        if (substr.length() > 18) {
            return substr.substring(0, 18);
        }
        return null;
    }

    private String getHours(int row) {//projects starts form row 6
        return tmpTable[row][27].replace(",", ".");//replace done to avoid java.lang.NumberFormatException: For input string: "2,5"
    }

    private void processSheet() {
        int n = 6;//first project line + counter for projects lines
        while (tmpTable[n][0].contains("DTIC")){
            finalReport[finTableLineCounter][0] = getName();
            finalReport[finTableLineCounter][1] = getProjectName(n);
            finalReport[finTableLineCounter][2] = getHours(n);// better keep in string and convert to double later?
            n++;
            finTableLineCounter++;
        }
    }

    public String [] [] getFinalReport() {
        return finalReport;
    }
    public int getFinTableLineCounter(){
        return finTableLineCounter;
    }

}






