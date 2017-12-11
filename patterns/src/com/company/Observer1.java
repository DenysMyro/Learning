package com.company;

public class Observer1 extends Observer {

    private String state;

    public Observer1() {
    }

    @Override
    public void update(String state) {
        this.state = state;
        System.out.println("updated1 "+getObs1State());
    }

    public String getObs1State() {
        return state;
    }
}
