package com.company;

public class EncapsulatedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
        this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHeatlh(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
