package com.company;

public class Observer2 extends Observer {

    private String state;

    @Override
    public void update(String state) {
            this.state = state;
        System.out.println("Updated2: "+getObs2State());
    }

    public String getObs2State() {
        return state;
    }
}
