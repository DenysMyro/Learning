package com.company;

import java.util.Comparator;

public class HobbyComparatorByFloat implements Comparator <Hobby> {
    @Override
    public int compare(Hobby o1, Hobby o2) {
        if (o1.getAvaregeHours()<o2.getAvaregeHours())
            return -1;
        else
            if (o1.getAvaregeHours()==o2.getAvaregeHours())
                return 0;
            else
                return 1;
    }
}
