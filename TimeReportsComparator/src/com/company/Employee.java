package com.company;

import java.util.HashMap;

public class Employee {

    private String name;
    private HashMap<String, Double> hm;

    public Employee(String name) {
        hm = new HashMap<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void addHoursToProject (String project, double hours){
        //to do : check that project is not already added
        hm.put(project,hours);
    }

    public Object getObj (String key){
        return null;

    }

    public HashMap<String, Double> getProjectsMap() {
        return hm;
    }
}
