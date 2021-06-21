package com.company.adaptor;

public class Main {


    public static void main(String[] args){
        //to create a movie player
        //mp4, mp3 supports two formats

        //movie player class ->

        MoviePlayer moviePlayer=new MP3Player();
        moviePlayer.play();

        MoviePlayer moviePlayer2=new ImageAdaptor();
        moviePlayer2.play();

    }
}
