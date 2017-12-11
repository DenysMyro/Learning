package com.company;

public class Observer1 extends Observer {

    private String state;

    public Observer1() {
    }

    @Override
    public void update(String state) {
        this.state = state;
        System.out.println("updated"+this.state);
    }
}
