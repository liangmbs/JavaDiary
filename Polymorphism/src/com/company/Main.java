package com.company;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }

    public String getName(){
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    public String plot(){
        return "Alien attempt to take over planet earth";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println( i +  ": " + movie.getName() + "\n"
                                + "plots: " + movie.plot());
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() *2) + 1;
        System.out.println("random number is" + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

        }

        return  null;
    }
}


