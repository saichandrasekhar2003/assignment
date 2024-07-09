package net.javaguides.gamerpro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testBattleScenario() {
        // Initialize players with their attributes
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        
        // Store initial health for comparison
        int initialHealthA = playerA.getHealth();
        int initialHealthB = playerB.getHealth();

        // Perform one round of battle
        Main.battle(playerA, playerB);

        // Determine which player's health should have decreased
        if (playerA.getHealth() < initialHealthA) {
            // Player A's health should have decreased
            assertTrue(playerA.getHealth() >= 0 && playerB.getHealth() == initialHealthB,
                       "Player A's health should decrease after battle");
        } else {
            // Player B's health should have decreased
            assertTrue(playerB.getHealth() >= 0 && playerA.getHealth() == initialHealthA,
                       "Player B's health should decrease after battle");
        }
    }
}
