package com.company;

import java.util.ArrayList;

public class TimeReport {

    ArrayList<Employee> EmpList1;

    public TimeReport() {
        EmpList1 = new ArrayList<Employee>();
    }

    public void addPerson (Employee person) {
        EmpList1.add(person);
    }

    public Employee getPerson (int i){
        return EmpList1.get(i);
    }

}
