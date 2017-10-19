package com.company;

public class Main {

    public static void main(String[] args) {

        Hobby noHobby = new Hobby();
        MountingBiking biking = new MountingBiking(2, "Commencal");
        Hobby mtb = new MountingBiking("el Camino");
        VideoGaming gaming = new VideoGaming(3,"Dark Souls");

        Hobby list [] = {noHobby, biking, mtb, gaming};

        for (Hobby hobby : list) {
            hobby.tellAboutHobby();
        }

        try{
            biking.doCrazyJumpOnSpeed(25);
        } catch (LowSpeedException e) {
            System.out.println("exception 1 caught "+"\n"+ e.getMessage());
        } catch (BrokenKneeException e) {
            System.out.println("exception 2 caught "+"\n"+ e.getMessage());
        }

    }

}
