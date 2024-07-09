package net.javaguides.gamerpro;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return "Player [health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
    }
}
