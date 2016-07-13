package com.company;

/**
 * Created by steven on 7/13/16.
 */
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "IS EATING");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + "IS Breathing");
    }
}


