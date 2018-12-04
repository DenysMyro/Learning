package com.company;


public class Main {

    public static void main(String[] args) {

        String csvFile = "C:\\IdeaProjects\\Learning\\TimeReportsComparator\\October.csv";

        TimeTrackingSys sys1 = new TimeTrackingSys("NAV");
        sys1.addPerson("Radko Roman", "ASI Android", 100.0);
        sys1.addPerson("Serg Martynenko", "DCBFC", 8.0);
        sys1.addPerson("Denka Myro", "Pacify", 40.0);
        sys1.addPerson("Denka Myro", "Medela", 20.0);
        sys1.addPerson("Denka Myro", "Medela", 20.0);
        sys1.addPerson("Denkas Myro", "Medela", 20.0);

        TimeTrackingSys sys2 = new TimeTrackingSys("QuickBooks");
        sys2.addPerson("Radko Roman", "ASI Android", 150.0);
        sys2.addPerson("Radko Roman", "LoompingTheDay", 1.0);
        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
        sys2.addPerson("Serg Martynenko", "DCBFC", 8.0);
        sys2.addPerson("Denka Myro", "Pacify", 40.0);
        sys2.addPerson("Denka Myro", "Medela", 20.0);

        System.out.println(sys1.compare(sys2));

    }
}

