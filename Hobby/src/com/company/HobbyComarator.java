package com.company;

import java.util.Comparator;

public class HobbyComarator implements Comparator <Hobby>{

    @Override
    public int compare(Hobby o1, Hobby o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
