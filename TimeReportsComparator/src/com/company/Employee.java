package com.company;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String Name;
    private HashMap<String, Double> hm;

    public Employee(String name) {
        hm = new HashMap<>();
        Name = name;
    }

    public String getName() {
        return Name;
    }



    public void addHoursToProject (String project, double hours){
        //to do : check that project is not already added
        hm.put(project,hours);
    }

    public Object getObj (String key){
        return hm.;
        
    }


}
