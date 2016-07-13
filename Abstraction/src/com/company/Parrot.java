package com.company;

/**
 * Created by steven on 7/13/16.
 */
public class Parrot extends Bird{

    public Parrot(String name){
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("flitting branch to branch");
    }
}
