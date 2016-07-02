package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1,1,12,33);

        Dog dog = new Dog("haha", 12,23,2,2,4,12,"sweet");
        Fish fish = new Fish(2,2,4);

        //inheriting
        dog.eat();


    }
}
