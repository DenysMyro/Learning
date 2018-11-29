package com.company;


public class Main {

    public static void main(String[] args) {

        TimeReport rep1 = new TimeReport();
        Employee p1 = new Employee("testName");

        rep1.EmpList1.add(p1);

        System.out.println(rep1.EmpList1.size());
        System.out.println(rep1.EmpList1.get(0));

    }
}

