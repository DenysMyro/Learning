package com.company;

import java.util.Comparator;

public class HobbyComparatorByTitle implements Comparator <Hobby>{

    @Override
    public int compare(Hobby o1, Hobby o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
