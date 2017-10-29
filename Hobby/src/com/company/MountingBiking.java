package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MountingBiking extends Hobby {
    String bikeName;

    /*CONSTRUCTORS*/
    public MountingBiking (){
        super.title = "Mounting Biking";
        timesPerWeek = 0;
    }
    public MountingBiking (int times, String bike) {
        super("Mounting Biking", times);
        this.bikeName = bike;
    }
    public MountingBiking (String bike) {
        super("Mounting Biking", 0);
        this.bikeName = bike;
    }

    /*METHODS*/

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public void tellAboutHobby () {
        System.out.println("my hobby is "+ this.title);
        System.out.println("I do it "+timesPerWeek+" times per week.");
        System.out.println("i have "+bikeName+" bike."+"\n");
    }

    //method to call exception
    public void doCrazyJumpOnSpeed (int speed) throws BrokenKneeException, LowSpeedException {

        if (speed>20) {
            throw new BrokenKneeException(speed);
        } else {
            if(speed<15){
            throw new LowSpeedException(speed);
        } else
            System.out.println("you did a nice jump!");
        }
    }
}
