package com.company;

/**
 * Created by steven on 7/13/16.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    public void fly(){
        super.fly();
        System.out.println("I can't fly");
    }
}
