package com.company;

public class VideoGaming extends Hobby {

    String favoriteGame;
    private String descritpion= "I play video Games";
    float avarageHours;

    public VideoGaming( int times, String favoriteGame, String description, float averagehours) {
        super("Video Gaming", times);
        this.favoriteGame = favoriteGame;
        this.descritpion = description;
        this.avarageHours = averagehours;
    }

    public String getDescritpion() {
        return descritpion;
    }

    @Override
    public int getTimesPerWeek() {
        return timesPerWeek;
    }

    public float getAvarageHours() {
        return avarageHours;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    @Override
    public void setTimesPerWeek(int timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public void setAvarageHours(float avarageHours) {
        this.avarageHours = avarageHours;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String newFavoriteGame) {
        this.favoriteGame = newFavoriteGame;
    }

    public void tellAboutHobby () {
        System.out.println("my hobby is "+ this.title);
        System.out.println("I do it "+timesPerWeek+" times per week.");
        System.out.println("My favorite game is "+favoriteGame+"\n");
    }
}
