package org.example.Homework8;

public class Lector extends Person {
    private double dailySalary;
    public static final int WORKING_DAY_IN_HOURS = 8;
    public static final int EXPERIENCED_LECTOR_MIN_AGE = 30;

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

            if (getAge() > EXPERIENCED_LECTOR_MIN_AGE) {
                double overtimePay = hours * ((dailySalary / WORKING_DAY_IN_HOURS) * 2);
                return overtimePay;
            } else {
                return 0;
            }
        }
    }

