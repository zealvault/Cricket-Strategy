package com.ee.enumeration;

/**
 * Created by Vishal on 07-09-2016.
 */
public class CricketPlayer {
    private PlayingStategy playingStategy;
    private String name;
    private int age;


    public CricketPlayer(String name,int age,PlayingStategy playingStategy){
        this.name = name;
        this.age = age;
        this.playingStategy = playingStategy;
    }

    public  void setPlayingStrategy(PlayingStategy playingPlayingStategy){
        this.playingStategy = playingPlayingStategy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String play(){
        return playingStategy.play();
    }
}
