package com.company.observer;

import java.io.File;
import java.io.FilenameFilter;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        //publisher -> Subject
        //subscriber -> Observer
        //types of observers -> NewsReader, FoodWrapper,

        Observer observer1=new Type1Observer(); //reading news
        Observer observer2=new Type1Observer(); //reading news
        Observer observer3=new Type2Observer(); //wrap food

        Subject subject=new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);



        subject.notifyObservers("Curfew will be imposed today!");

        Thread.sleep(3000);
        System.out.println("*****************************");

        subject.notifyObservers("Revered: Curfew will not be imposed today!");

        Thread.sleep(3000);

        subject.unsubscribe(observer2);

        Thread.sleep(3000);
        System.out.println("*****************************");

        subject.notifyObservers("Fuel price gone up");

    }
}
