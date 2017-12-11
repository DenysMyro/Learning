package com.company;

public class Main {

    public static void main(String[] args) {

        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();

        Subject sub1 = new Subject("state good", ob1);

        sub1.attach(ob2);
        sub1.notifyAllObservers();

        System.out.println(ob1.getObs1State()+" "+ob2.getObs2State());

        sub1.setState("bad");

        System.out.println(ob1.getObs1State()+" "+ob2.getObs2State());




	// write your code here
    }
}
