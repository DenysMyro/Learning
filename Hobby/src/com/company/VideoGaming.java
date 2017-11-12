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

    public float getAvarageHours() {
        return avarageHours;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
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
        System.out.println("my hobby is "+ getTitle());
        System.out.println("I do it "+getTimesPerWeek()+" times per week.");
        System.out.println("My favorite game is "+favoriteGame+"\n");
    }
}
