package org.example.Homework7;

import java.util.Random;

public class Enemy {
    int health;
    int strength;
    int level;

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    Enemy() {
        this.health = 150;
        this.strength = 4;
        this.level = 1;

    }

    Enemy(int health, int strength, int level) {
        this.health = health;
        this.strength = strength;
        this.level = level;

    }

    public void attack(Hero hero) {
        boolean isCriticalHit = Math.random() <= 0.3;
        int damage = strength + (isCriticalHit ? 3 : 0);

        hero.health -= damage;

        if (hero.health <= 0) {
            hero.health = 0;
            System.out.println("Enemy defeated the Hero!");
        } else {
            System.out.println("Enemy attacked the Hero for " + damage + " damage.");
            System.out.println("Hero's health: " + hero.health);
        }
    }

    public int getRandomEnemyStrength(int heroLevel) {
        return (new Random().nextInt(3) + 8) * heroLevel;
    }

    }

