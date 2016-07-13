package com.company;

/**
 * Created by steven on 7/13/16.
 */
public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName(){
        return name;
    }

}

