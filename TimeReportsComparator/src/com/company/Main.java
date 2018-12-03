package com.company;


public class Main {

    public static void main(String[] args) {

        String [] projects = {"project1", "project2", "project3"};
        double [] hours = {5.0, 2.2, 0.75};

        TimeTrackingSys rep1 = new TimeTrackingSys();
        TimeTrackingSys rep2 = new TimeTrackingSys();
        Employee p1 = new Employee("testName");
        Employee p2 = new Employee("testName2");
        Employee p3 = new Employee("testName3");

        p1.addHoursToProject(projects[0],hours[1]);
        p1.addHoursToProject(projects[1],hours[1]);
        p2.addHoursToProject(projects[0],hours[0]);
        p3.addHoursToProject(projects[2], hours[2]);


        rep1.addPerson(p1);
        rep1.addPerson(p2);
        rep2.addPerson(p3);

        for(int i=0; i<rep1.EmpList.size(); i++){
            String key = rep1.EmpList.get(i).getName();
            System.out.println(rep1.getPerson(i).getObj(key));
        }

    }
}

