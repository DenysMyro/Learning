package com.company;

import java.util.Comparator;

public class HobbyComparatorByDescription implements Comparator <Hobby> {

    @Override
    public int compare(Hobby o1, Hobby o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
