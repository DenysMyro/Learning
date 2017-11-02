package com.company;

public class Soldier extends Human implements ABLE_TO_FIGHT {

    String rank;

    Commander commanderToReport;

    public Soldier(String name) {
        super(name);
        this.rank = "Soldier";
    }

    public Soldier(String name, Commander commanderToReport) {
        super(name);
        this.rank = "Soldier";
        this.commanderToReport = commanderToReport;
    }

    public Commander getCommanderToReport() {
        return commanderToReport;
    }

    public void setCommanderToReport(Commander commanderToReport) {
        this.commanderToReport = commanderToReport;
    }

    public String getRank() {
        return rank;
    }

    public void report() {
        System.out.println(getRank()+" "+getName()+" Reporting to "+getCommanderToReport());
        System.out.println(getRank()+" "+getName()+" Ready to fight");
    }


    public void fight() {
        System.out.println(rank+" "+this.name + " Is fighting");
    }
}
