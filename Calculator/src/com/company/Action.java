package com.company;

public interface Action {
    /*Method returning Action number to identify action in the loop*/
    int getActionNumber ();

    /*description method should print action description, and request input data if needed*/
    void description ();

    /*doWork method should provide calculations and print results*/
    void doWork ();
}
