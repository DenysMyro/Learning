package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeTrackingSys {

    Map <String, SpentTime> employeeTime = new HashMap<>();


    public void addPerson (Employee person) {
        employeeTime.put(person.getName(), );
    }

    public Employee getPerson (int position){
        return EmpList.get(position);
    }

}
