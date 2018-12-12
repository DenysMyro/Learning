package com.company;


public class Main {

    public static void main(String[] args) throws Exception {
        /*CSV file path*/

        String report = "/home/denys/Desktop/TimeReportsNOV/Sub DTIC NOV Timesheets";
        String firstCSVfile = "/home/denys/Desktop/TimeReportsNOV/PowertekPriorMonthHoursReportNOV.csv";

//        String firstCSVfile = "C:\\Users\\Defto\\Desktop\\TimeReportsNOV\\PowertekPriorMonthHoursReportNOV.csv";
//        String report = ("C:\\Users\\Defto\\Desktop\\TimeReportsNOV\\Sub DTIC NOV Timesheets");

        TimeTrackingSys sys1 = new TimeTrackingSys("NAV");
        TimeTrackingSys sys2 = new TimeTrackingSys("PowertekQuickBooks");
        /* MOCK DATA*/
//        sys1.addPerson("Denka Myro", "Project1", 40.0);
//        sys1.addPerson("Denka Myro", "Project2", 20.0);
//        sys1.addPerson("Denka Myro", "Project1", 20.0);
//        sys1.addPerson("Denkas Myro", "Project1", 20.0);
//        sys2.addPerson("Denka Myro", "Project2", 40.0);
//        sys2.addPerson("Denka Myro", "Project1", 20.0);

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

        String s = "asdasd asdsd";

        sys1.printPersonTime(s);
        sys2.printPersonTime(s);





    }
}


