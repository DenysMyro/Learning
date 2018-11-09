package com.company;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String csvFile = "/home/denys/IdeaProjects/Learning/TimeReportsComparator/Masslight_October.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String[] Employee = new String[10];

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                for (int i =0;i<country.length;i++){
                    System.out.println(country[i]);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}

