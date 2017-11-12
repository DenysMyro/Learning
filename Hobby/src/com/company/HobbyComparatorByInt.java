package com.company;

import java.util.Comparator;

public class HobbyComparatorByInt implements Comparator<Hobby> {

    @Override
    public int compare(Hobby o1, Hobby o2) {
        if (o2.getTimesPerWeek()<o1.getTimesPerWeek())
            return -1;
        else
        if (o1.getTimesPerWeek()==o2.getTimesPerWeek())
            return 0;
        else
            return 1;
    }
}
