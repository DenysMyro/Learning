package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

     /* Hobby noHobby = new Hobby();
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
        */

        MountingBiking biking = new MountingBiking(1, "ElCamino", "I like to do MTB", 2.5f);
        VideoGaming gaming = new VideoGaming(7, "Dark Souls","Video games is my passion", 7);

        List <Hobby> ls = new ArrayList<>();

        ls.add(biking);
        ls.add(gaming);

        System.out.println("before sorting: "+ls+"\n");

        Collections.sort(ls, new HobbyComarator());

        System.out.println("after sorting: "+ls);

    }

}
