package com.company;

public class LowSpeedException extends Throwable {

    private static final String MESSAGE = "To do a perfect jump your speed must be between 15 and 20";

    public LowSpeedException(int speed) {
        super("Speed "+speed+" is too low. "+MESSAGE);
    }

}
