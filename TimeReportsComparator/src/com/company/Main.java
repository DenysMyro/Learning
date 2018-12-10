package com.company;


public class Main {

    public static void main(String[] args) throws Exception {
        /*CSV file path*/

//        File doc = new File("/home/denys/IdeaProjects/Learning/TimeReportsComparator/October.xls");
        String firstCSVfile = "C:\\Users\\Defto\\Desktop\\TimeReportsNOV\\PowertekPriorMonthHoursReportNOV.csv";
        String report = ("C:\\Users\\Defto\\Desktop\\TimeReportsNOV\\Sub DTIC NOV Timesheets");


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
        //fill sys2 with parsed data
        for (int i = 1; i < parser.getLineCounter(); i++) { //i=1 cause 0 is table table
            sys2.addPerson(parser.getName(i), parser.gerProjectName(i), parser.getHours(i));
        }

        //read all files for sys1
        for (int i=1;i<57;i++){
            String path = report+i+".csv";
            secondParser.addSheet(path);
        }
        //transfer parsed data to sys1
        for (int i=0; i<secondParser.getFinTableLineCounter(); i++){
            sys1.addPerson(secondParser.getFinalReport()[i][0],secondParser.getFinalReport()[i][1],Double.parseDouble(secondParser.getFinalReport()[i][2]));
        }

        //Compare reports
        System.out.println(sys1.compare(sys2));



    }
}


