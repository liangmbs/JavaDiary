package com.company;

/**
 * Created by steven on 7/1/16.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    // cause all dogs have brain and body, we used the 1, 1 to express that.
    // also we delete the brain and body parameter in the parentheses
    public Dog(String name,  int size,
               int weight, int eyes, int legs,
               int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;

    }
    private void chew(){
        System.out.println("chewing");
    }

    //Generate the override method
    @Override
    public void eat() {
        //System.out.println("dog is eating");
        chew();
        super.eat();
    }
}
