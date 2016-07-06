package com.company;

/**
 * Created by steven on 7/6/16.
 */
public class enhancedPlayer {

    private String name;
    private int hitPoint = 100;
    private String weapon;

    public enhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >0 && health <=100){
            this.hitPoint = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoint = this.hitPoint - damage;
        if(this.hitPoint <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHitPoint() {
        return hitPoint;
    }
}
