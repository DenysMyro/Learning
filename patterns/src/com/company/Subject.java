package com.company;

import java.util.List;

public class Subject {

    String state;
    List <Observer> list;


    public Subject() {}

    public Subject(String state, Observer ob) {
        this.state = state;
        attach(ob);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach (Observer obs) {
        list.add(obs);
    }

    public void notifyAllObservers () {
        for (Observer ob:list
             ) {
            ob.update(getState());
        }
    }
}
