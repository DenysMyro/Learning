package com.company;

public abstract class Observer {

    Subject subject;

    public abstract void update(String state);

}
