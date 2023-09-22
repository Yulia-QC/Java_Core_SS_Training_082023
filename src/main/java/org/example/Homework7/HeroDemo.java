package org.example.Homework7;

import java.util.ArrayList;
import java.util.Random;

//String name, int health, int strength, int experience, int level int health, int strength, int level
public class HeroDemo {
    public static void main(String[] args) {
        int heroRandomStrength = new Random().nextInt(6) + 5;

        Hero optimusPrime = new Hero("Optimus Prime", 100, heroRandomStrength, 0, 1);

        ArrayList<Enemy> enemies = new ArrayList<>();

        int interactions = 0;

        while (interactions < 10) {
            int enemyRandomStrength = new Random().nextInt(3) + 8;
            int randomHealth = new Random().nextInt(101) + 100;
            int heroRandomLevel = new Random().nextInt(4) + 4;
            int enemyRandomLevel = new Random().nextInt(1) + heroRandomLevel;
            Enemy enemy = new Enemy(randomHealth, enemyRandomStrength, enemyRandomLevel);
            enemies.add(enemy);

            boolean heroStarts = Math.random() <= 0.5;

            if (heroStarts) {
                if (enemyRandomLevel > heroRandomLevel) {
                    optimusPrime.avoid(enemy);
                } else {
                    optimusPrime.attack(enemy);
                }
            } else {
                enemy.attack(optimusPrime);
            }
            interactions++;
        }


    }
}
