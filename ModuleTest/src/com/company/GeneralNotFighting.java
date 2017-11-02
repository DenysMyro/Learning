package com.company;

public class GeneralNotFighting extends Exception{

    String message = "Generals are not fighting";

    public GeneralNotFighting() {

    }

    public GeneralNotFighting(String s) {
        super(s);
    }
}
