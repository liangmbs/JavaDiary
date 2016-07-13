package com.company;

/**
 * Created by steven on 7/13/16.
 */
public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + "IS Breathing");
    }

    @Override
    public void fly() {

    }
}
