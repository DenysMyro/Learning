package com.company;

import java.util.ArrayList;

public class TimeReport {

    ArrayList<Employee> EmpList;

    public TimeReport() {
        EmpList = new ArrayList<Employee>();
    }

    public void addPerson (Employee person) {
        EmpList.add(person);
    }

    public Employee getPerson (int position){
        return EmpList.get(position);
    }

}
