package com.company;

/**
 * Created by steven on 7/1/16.
 */
public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int gills, int eyes, int fins) {
        super(name,1,1,size,weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void swim(){
        moveMuscles();
        rest();
    }
}
