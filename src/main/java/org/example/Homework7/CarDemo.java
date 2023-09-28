package org.example.Homework7;

public class CarDemo {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.model = "Ford";
        ford.color = "Green";
        ford.fuel = "Gasoline";

        Car toyota = new Car();
        toyota.model = "Toyota";
        toyota.color = "Red";
        toyota.fuel = "Electricity";

        ford.currentGear = "R";
        ford.maxSpeed = 120;
        Person olga = new Person();
        olga.name = "Olga";
        olga.age = 35;

        ford.owner = olga;

        System.out.println(ford.owner.name);
        System.out.println(ford.owner.age);

        olga.age = 36;
        System.out.println(ford.owner.age);

        Person yulia = new Person();
        yulia.name = "Yulia";
        yulia.age = 37;

        olga.friend = yulia;

        System.out.println(ford.owner.friend.name);

        yulia.friend = olga;
        System.out.println(ford.owner.friend.friend.name);

        Person oleg = new Person(18,"Oleg");
        System.out.println(oleg.age);

        Person nikita = new Person(7,"Nikita");
        System.out.println(nikita.name);


    }
}
