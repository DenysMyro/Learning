package com.company;

public class Employee {

    private String Name;
    private String Project;
    private String time1;
    private String time2;

    public Employee() {
    }

    public Employee(String name) {
        Name = name;
    }

    public Employee(String name, String project, String time1) {
        Name = name;
        Project = project;
        this.time1 = time1;
    }

    public Employee(String name, String project, String time1, String time2) {
        Name = name;
        Project = project;
        this.time1 = time1;
        this.time2 = time2;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }
}
