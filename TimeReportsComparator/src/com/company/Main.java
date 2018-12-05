package com.company;


import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

//        File doc = new File("C:\\IdeaProjects\\Learning\\TimeReportsComparator\\October.xls");
        File doc = new File("/home/denys/IdeaProjects/Learning/TimeReportsComparator/October.xls");

        ParcerOne parse = new ParcerOne();

        parse.setExcelFile(doc,"Sheet1");
        System.out.println(parse.getCellData(4,1));




//        TimeTrackingSys sys1 = new TimeTrackingSys("NAV");
//        sys1.addPerson("Radko Roman", "ASI Android", 100.0);
//        sys1.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys1.addPerson("Denka Myro", "Pacify", 40.0);
//        sys1.addPerson("Denka Myro", "Medela", 20.0);
//        sys1.addPerson("Denka Myro", "Medela", 20.0);
//        sys1.addPerson("Denkas Myro", "Medela", 20.0);
//
//        TimeTrackingSys sys2 = new TimeTrackingSys("QuickBooks");
//        sys2.addPerson("Radko Roman", "ASI Android", 150.0);
//        sys2.addPerson("Radko Roman", "LoompingTheDay", 1.0);
//        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys2.addPerson("Denka Myro", "Pacify", 40.0);
//        sys2.addPerson("Denka Myro", "Medela", 20.0);

//        System.out.println(sys1.compare(sys2));

    }
}

