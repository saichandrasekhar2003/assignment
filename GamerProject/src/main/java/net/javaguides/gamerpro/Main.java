package net.javaguides.gamerpro;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        System.out.println("Game Start!");
        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            battle(playerA, playerB);
        }
        System.out.println("Game Over!");
    }

    public static void battle(Player playerA, Player playerB) {
        // Determine attacker and defender based on their health
        Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;

        // Generate random attack and defend rolls
        Random rand = new Random();
        int attackRoll = rand.nextInt(6) + 1;
        int defendRoll = rand.nextInt(6) + 1;

        // Calculate damage
        int attackDamage = attacker.getAttack() * attackRoll;
        int defendDamage = defender.getStrength() * defendRoll;
        int damageToDefender = attackDamage - defendDamage;

        // Ensure damage is not negative
        if (damageToDefender < 0) {
            damageToDefender = 0;
        }

        // Apply damage to defender
        defender.reduceHealth(damageToDefender);

        // Print the result of the attack
        System.out.println(attacker + " attacks " + defender + " with damage " + damageToDefender);
        System.out.println(defender + " health: " + defender.getHealth());
    }
}
