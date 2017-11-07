package com.company;

public class Hobby {

    String title;
    int timesPerWeek;

    /*CONSTRUCTORS*/

    public Hobby () {
    }

    public Hobby (String name) {
        this.title = name;
    }

    public Hobby (String name, int times) {
        this.title = name;
        this.timesPerWeek = times;
    }

    /*METHODS*/

    public String getTitle() {
        return title;
    }

    public int getTimesPerWeek() {
        return timesPerWeek;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTimesPerWeek(int timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public void tellAboutHobby () {
        System.out.println("I have no Hobby"+"\n");
    }

    @Override
    public String toString() {
        return title;
    }
}
