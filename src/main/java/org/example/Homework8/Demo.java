package org.example.Homework8;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Person("Joanna", "Peterson", 27, "female");
        people[1] = new Person("Nikita", "Terentiev", 7, "male");
        people[2] = new Person("Raisa", "Kozlova", 90, "female");
        people[3] = new Student("Janifer", "Smith", 21, "female", 85.00);
        people[4] = new Student("Oleg", "Petrovsky", 25, "male",75.00);
        people[5] = new Student("Olga", "Stankevich", 40, "female",100.00);
        people[6] = new Lector("Eugen", "Tereshenko", 29, "male", 150.00);
        people[7] = new Lector("Nickola", "Edison", 35, "male",200);
        people[8] = new Lector("Marie", "Curie", 50, "female",500);
        people[9] = new Person("any", "any", 0, "any");

        for(Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
                System.out.println();
            } else if (person instanceof Lector) {
                ((Lector) person).showLectorInfo();
                System.out.println();
            } else {
                person.showPersonInfo();
                System.out.println();
            }
        }

        System.out.println("---------------------------------------------------------");

        for(Person person : people) {
            if (person instanceof Lector) {
                Lector lector = (Lector) person;
                System.out.println(lector.getFirstName() + " " + lector.getLastName() + " has overtime payment: " + lector.calculateOvertime(4));
            }
        }


    }
}
