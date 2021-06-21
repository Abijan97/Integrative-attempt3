package com.company.observer;


//reading a news
public class Type1Observer  implements Observer{

    //accept the email address as a constructor
    @Override
    public void notifyObserver(String news) {
        //send an email
        System.out.println("Reading the news: "+news);
    }
}
