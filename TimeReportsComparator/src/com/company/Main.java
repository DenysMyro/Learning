package com.company;


import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

//        File doc = new File("C:\\IdeaProjects\\Learning\\TimeReportsComparator\\October.xls");
        File doc = new File("/home/denys/IdeaProjects/Learning/TimeReportsComparator/October.xls");
        String csvFile = "C:\\IdeaProjects\\Learning\\TimeReportsComparator\\PowertekPriorMonthHoursReport.csv";


        TimeTrackingSys sys1 = new TimeTrackingSys("NAV");
//        sys1.addPerson("Radko Roman", "ASI Android", 100.0);
        sys1.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys1.addPerson("Denka Myro", "Pacify", 40.0);
//        sys1.addPerson("Denka Myro", "Medela", 20.0);
//        sys1.addPerson("Denka Myro", "Medela", 20.0);
//        sys1.addPerson("Denkas Myro", "Medela", 20.0);
//
        TimeTrackingSys sys2 = new TimeTrackingSys("QuickBooks");
//        sys2.addPerson("Radko Roman", "ASI Android", 150.0);
//        sys2.addPerson("Radko Roman", "LoompingTheDay", 1.0);
        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys2.addPerson("Denka Myro", "Pacify", 40.0);
        sys2.addPerson("Denka Myro", "Medela", 20.0);

        PowertekParser parser = new PowertekParser(csvFile, ";", 535, 8);

        for(int i=0; i<parser.getLineCounter(); i++){
            sys1.addPerson(parser.getName(i), parser.gerProjectName(i), parser.getHours(i));
            sys2.addPerson(parser.getName(i), parser.gerProjectName(i), parser.getHours(i));

        }
        System.out.println(sys1.compare(sys2));
    }
}


