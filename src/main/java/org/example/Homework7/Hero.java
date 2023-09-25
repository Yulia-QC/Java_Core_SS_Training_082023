package org.example.Homework7;

import java.util.Random;

/*
Task1
 */
public class Hero {
    String name;
    int health;
    int strength;
    int experience;
    int level;

    Hero() {
        this.name = "Default Hero";
        this.health = 100;
        this.strength = 7;
        this.experience = 0;
        this.level = 1;

    }

    Hero(String name, int health, int strength, int experience, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.experience = experience;
        this.level = level;

    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public void attack(Enemy enemy) {
        boolean isCriticalHit = Math.random() <= 0.1;
        int damage = strength + (isCriticalHit ? 3 : 0);
        enemy.health -= damage;

        if (enemy.health <= 0) {
            enemy.health = 0;
            System.out.println("Hero defeated the enemy! ");

            if (Math.random() <= 0.3) {
                setHealth(100);
                System.out.println("Hero's health restored to 100.");
            }
            int experienceGained = 50 * enemy.level;
            experience += experienceGained;
            System.out.println("Hero gained " + experienceGained + " experience points.");
        } else {
            System.out.println("Hero attacked the enemy for " + damage + " damage.");
            System.out.println("Enemy's health: " + enemy.health);
        }
    }

    public void avoid(Enemy enemy) {
        System.out.println(name + " avoids the enemy");
        experience -= 10;
        health = Math.min(health + 50, 100 * level);
    }

    public void setHealth(int health) {
        int maxHealth = 100 * level;
        this.health = Math.min(health, maxHealth);
    }

    public void levelUp() {
        int maxHealth = 100 * level;
        int maxStrength = strength * level;
        experience = 0;
        level++;
        health = Math.min(health + 50, maxHealth);
        strength = Math.min(strength + (new Random().nextInt(6 - 3) + 3), maxStrength);
    }

    public int getHeroRandomHealth(int heroLevel) {
        return (new Random().nextInt(101) + 100) * heroLevel;
    }
    public int getHeroRandomLevel() {
        return(new Random().nextInt(4)) + 4;
    }


}
