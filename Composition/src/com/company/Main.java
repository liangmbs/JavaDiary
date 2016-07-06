package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimension = new Dimensions(20, 20, 5);
        Case theCase = new Case ("220B", "Dell", "240", dimension);

        Monitor theMonitor = new Monitor("27inch Beast", new Resolution(2540 , 1440), 27, "Acer");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thisPC = new PC(theCase, theMonitor, theMotherboard);

        thisPC.getMonitor().drawPixelAt(1200,240, "blue");
    }
}
