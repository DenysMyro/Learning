package com.company;

public class Main {

    public static void main(String[] args) {

        Observer1 ob1 = new Observer1();

        Subject sub1 = new Subject("state good", ob1);

        sub1.notifyAllObservers();


	// write your code here
    }
}
