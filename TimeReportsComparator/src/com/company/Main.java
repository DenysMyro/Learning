package com.company;


public class Main {

    public static void main(String[] args) throws Exception {
        /*CSV file path*/

//        File doc = new File("/home/denys/IdeaProjects/Learning/TimeReportsComparator/October.xls");
        String firstCSVfile = "C:\\IdeaProjects\\Learning\\TimeReportsComparator\\PowertekPriorMonthHoursReportNOV.csv";
        String report2 = ("C:\\IdeaProjects\\Learning\\TimeReportsComparator\\Sub DTIC NOV Timesheets14.csv");
        String report3 = ("C:\\IdeaProjects\\Learning\\TimeReportsComparator\\Sub DTIC NOV Timesheets2.csv");
        String report4 = ("C:\\IdeaProjects\\Learning\\TimeReportsComparator\\Sub DTIC NOV Timesheets18.csv");

        /* MOCK DATA*/
        TimeTrackingSys sys1 = new TimeTrackingSys("NAV");
//        sys1.addPerson("Radko Roman", "ASI Android", 100.0);
//        sys1.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys1.addPerson("Denka Myro", "Pacify", 40.0);
//        sys1.addPerson("Denka Myro", "Medela", 20.0);
//        sys1.addPerson("Denka Myro", "Medela", 20.0);
//        sys1.addPerson("Denkas Myro", "Medela", 20.0);
        TimeTrackingSys sys2 = new TimeTrackingSys("QuickBooks");
//        sys2.addPerson("Radko Roman", "ASI Android", 150.0);
//        sys2.addPerson("Radko Roman", "LoompingTheDay", 1.0);
//        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
//        sys2.addPerson("Denka Myro", "Pacify", 40.0);
//        sys2.addPerson("Denka Myro", "Medela", 20.0);

        PowertekParser parser = new PowertekParser(firstCSVfile, ";", 535, 8);
        DTICparser secondParser = new DTICparser();
        for (int i = 1; i < parser.getLineCounter(); i++) { //i=1 cause 0 is table table
            sys1.addPerson(parser.getName(i), parser.gerProjectName(i), parser.getHours(i));
            sys2.addPerson(parser.getName(i), parser.gerProjectName(i), parser.getHours(i));
        }
        sys1.addPerson(parser.getName(12), parser.gerProjectName(31), 255.2);
        System.out.println(sys1.compare(sys2));
//        parser.printTable();

        secondParser.addSheet(report2);
        secondParser.addSheet(report3);
        secondParser.addSheet(report4);

        secondParser.printFinalReport();


    }
}


