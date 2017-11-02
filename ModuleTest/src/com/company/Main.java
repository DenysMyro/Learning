package com.company;

public class Main {

    public static void main(String[] args) {

        General general = new General("Greg McMac");

        Commander commander1 = new Commander("Anton K.", general);
        Commander commander2 = new Commander("Yakus J.", general);

        Soldier soldier1 = new Soldier("Jone Doe", commander1);

        Soldier soldier2 = new Soldier("Jone Snow", commander2);

        ABLE_TO_FIGHT list [] = {general, commander1, soldier1, soldier2};

        for (ABLE_TO_FIGHT man: list
             ) { man.report();
                 man.fight();
        }
    }
}
