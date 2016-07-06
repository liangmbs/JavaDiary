package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        enhancedPlayer player = new enhancedPlayer("steven" , 200, "sword");
        //Even though I used the 200 as initial, however, it would still show up 100
        System.out.println(player.getHitPoint());
    }
}
