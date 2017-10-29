package com.company;

public class VideoGaming extends Hobby {

    String favoriteGame;

    public VideoGaming( int times, String favoriteGame) {
        super("Video Gaming", times);
        this.favoriteGame = favoriteGame;
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
