package com.company;

public class VideoGaming extends Hobby {

    private String favoriteGame;

    public VideoGaming( int times, String favoriteGame, String description, float averagehours) {
        super("Video Gaming", times, description, averagehours);
        this.favoriteGame = favoriteGame;
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
