package com.company;

public class Hobby {

    private String title;
    private int timesPerWeek;
    private float averageHours;
    private String description;

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

    public Hobby (String title, int times, String description, float averageHours) {
        this.title = title;
        this.timesPerWeek = times;
        this.description = description;
        this.averageHours = averageHours;
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

    public float getAvaregeHours() {
        return averageHours;
    }

    public void setAvaregeHours(float avaregeHours) {
        this.averageHours = avaregeHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void tellAboutHobby() {
        System.out.println("My hobby is "+getTitle()+"\n"+getDescription()+" I do "+getTitle()+" "+getTimesPerWeek()+" times per week, in average for "+getAvaregeHours()+" hours"+"\n");
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
