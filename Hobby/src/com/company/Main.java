package com.company;

public class Main {

    public static void main(String[] args) {

        Hobby noHobby = new Hobby();
        MountingBiking Biking = new MountingBiking(2, "Commencal");
        Hobby MTB = new MountingBiking("el Camino");

        Hobby list [] = {noHobby, Biking, MTB};

        for (Hobby hobby : list) {
            hobby.tellAboutHobby();
        }

        try {
            Biking.doCrazyJump();
        } catch (BrokenKneeException e){
            e.getMessage();
            System.out.println("exception caught");
        }

    }
}
