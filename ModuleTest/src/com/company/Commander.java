package com.company;

public class Commander extends Human implements ABLE_TO_FIGHT{

    String rank;
    General generalToReport;


    public Commander(String name, General generalToReport) {
        super(name);
        this.generalToReport = generalToReport;
        rank = "Commander";
    }

    public Commander(String name) {
        super(name);
        rank = "Commander";

    }

    public General getGeneralToReport() {
        return generalToReport;
    }

    public void setGeneralToReport(General generalToReport) {
        this.generalToReport = generalToReport;
    }

    public String getRank() {
        return rank;
    }

    public void report() {
        System.out.println(getRank()+" "+getName()+" Reporting to "+getGeneralToReport());
        System.out.println("Ready to fight");
    }


    public void fight() {
        System.out.println(getRank()+" "+getName()+" Is fighting");
    }

    @Override
    public String toString() {
        return rank +" "+ name;
    }
}
