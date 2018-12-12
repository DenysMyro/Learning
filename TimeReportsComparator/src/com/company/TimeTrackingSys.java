package com.company;

import java.util.*;

public class TimeTrackingSys {

    private final String name;
    private final Map<String, SpentTime> employeeTime = new HashMap<>();

    public TimeTrackingSys(String name) {
        this.name = name;
    }

    public void addPerson(String personName, String project, double time) {
        getSpentTime(personName).addTime(project, time);
    }

    public String compare(TimeTrackingSys otherSys) {
        StringBuilder report = new StringBuilder("");
        Set<String> allEmployees = new HashSet<>();
        allEmployees.addAll(employeeTime.keySet());
        allEmployees.addAll(otherSys.employeeTime.keySet());
        for (String employee : allEmployees) {
            SpentTime sys1 = getSpentTime(employee);
            SpentTime sys2 = otherSys.getSpentTime(employee);
            List<String> missmatch = sys1.findMissmatchProjects(sys2);
            Collections.sort(missmatch);
            if (!missmatch.isEmpty()) {
                report.append("----------------------------------------\n")
                        .append(employee)
                        .append("\n");
                for (String project : missmatch) {
                    report.append(project)
                            .append(": ")
                            .append(sys1.getTime(project))
                            .append("(")
                            .append(name)
                            .append("), ")
                            .append(sys2.getTime(project))
                            .append("(")
                            .append(otherSys.name)
                            .append(")\n");
                }
            }
        }
        return report.toString();
    }

    private SpentTime getSpentTime(String empName) {
        if (!employeeTime.containsKey(empName)) {
            employeeTime.put(empName, new SpentTime());
        }
        return employeeTime.get(empName);
    }

    public void printPersonTime (String name) {
        System.out.print(name+": ");
        System.out.println(getSpentTime(name));
    }


    @Override
    public String toString() {
        //todo :return list of system entries (name, projects, time)
        return "TimeTrackingSys{" +
                "name='" + name + '\'' +
                ", employeeTime=" + employeeTime +
                '}';
    }
}
