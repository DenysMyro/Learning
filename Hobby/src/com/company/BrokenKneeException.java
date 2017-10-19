package com.company;

public class BrokenKneeException extends Throwable {

    private static final String MESSAGE ="To do a perfect jump your speed must be between 15 and 20";


    public BrokenKneeException(int speed) {
        super("Your knee has been broken because of crash on speed: "+speed+". "+MESSAGE);
    }

}
