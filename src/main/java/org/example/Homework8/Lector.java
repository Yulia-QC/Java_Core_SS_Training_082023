package org.example.Homework8;

public class Lector extends Person {
    private double dailySalary;
    private int workingHours = 8;

    public Lector(String firstName, String lastName, int age, String gender, double dailySalary) {
        super(firstName, lastName, age, gender);
        this.dailySalary = dailySalary;
    }

    public Lector(String firstName, String lastName, int age, String gender) {
        super(firstName, lastName, age, gender);
    }

    public void showLectorInfo() {
        super.showPersonInfo();
        System.out.println("Daily salary: " + dailySalary);
    }

    public double calculateOvertime(double hours) {

            if (getAge() > 30) {
                double overtimePay = hours * ((dailySalary / workingHours) * 2);
                return overtimePay;
            } else {
                return 0;
            }
        }
    }

