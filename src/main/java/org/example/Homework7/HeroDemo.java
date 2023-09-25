package org.example.Homework7;

import java.util.ArrayList;
import java.util.Random;

//String name, int health, int strength, int experience, int level int health, int strength, int level
public class HeroDemo {
    public static void main(String[] args) {
        int heroRandomStrength = new Random().nextInt(6) + 5;

        Hero optimusPrime = new Hero("Optimus Prime", 100, heroRandomStrength, 0, 1);
        Enemy enemy = new Enemy();

        int interactions = 0;


        while (interactions < 10) {
            int heroLevel = optimusPrime.getLevel();
            int enemyRandomStrength = (int) (enemy.getRandomEnemyStrength(heroLevel)*0.10);
            int heroRandomHealth = optimusPrime.getHeroRandomHealth(heroLevel);
            int heroRandomLevel = optimusPrime.getHeroRandomLevel();
            int enemyRandomLevel = new Random().nextInt(optimusPrime.getLevel()) + 1;
            enemy = new Enemy(heroRandomLevel, enemyRandomStrength, enemyRandomLevel);


            boolean heroStarts = Math.random() <= 0.5;

            if (heroStarts) {
                if (enemy.getLevel() > optimusPrime.getLevel()) {
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
