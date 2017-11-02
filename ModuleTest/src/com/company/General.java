package com.company;

public class General extends Human implements ABLE_TO_FIGHT {

    String rank;

    public General(String name) {
        super(name);
        rank = "General";
    }

    public String getRank() {
        return rank;
    }

    @Override
    public void report() {
        System.out.println(getRank()+" "+getName()+" has no one to report");
    }

    @Override
    public void fight() {
        try {
            throw new GeneralNotFighting();
        } catch (GeneralNotFighting e) {
            System.out.println(e.message+"\n");
        }
    }
    @Override
    public String toString() {
        return rank +" "+ name;
    }
}
