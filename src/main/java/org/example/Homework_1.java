package org.example;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Task 1 Comparison Solution");
        printComparisonNumbersResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 2 Calculation Integer Solution");
        printIntegerCalculationsResult(scanner);
        System.out.println("-----------------------------------------------------");
        System.out.println("Task 2 Calculation Double Solution");
        printDoubleCalculationsResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 3 Sorting Solution");
        printSortNumbersResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 4 Swapping Solution");
        swapNumbersResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 5 Making Decision Solution");
        makeDesisionResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 6 Form from Four Digits Solution");
        formFromFourDigitsResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 7 Two Digits Multiply Solution");
        multiplyTwoDigitsResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 8 Check Divisible by Each Solution");
        divisibleByEachResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 9 Rain Forecast by Each Solution");
        rainForecastResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 10 Welcoming Solution");
        welcomingHoursResult(scanner);
        System.out.println("-----------------------------------------------------");

        System.out.println("Task 11 Check Divisible by Each Solution");
        orderChekResult(scanner);
        System.out.println("-----------------------------------------------------");

        scanner.close();

    }

    public static void printComparisonNumbersResult(Scanner scanner) {

        double A = 0;
        double B = 0;
        double C = 0;
        boolean validInput = false;

        try {
            System.out.print("Enter A: ");
            A = scanner.nextDouble();

            System.out.print("Enter B: ");
            B = scanner.nextDouble();

            System.out.print("Enter C: ");
            C = scanner.nextDouble();

            if (C > A && C < B) {
                System.out.println(C + " is between " + A + " and " + B);
            } else if (C < A && C > B) {
                System.out.println(C + " is between " + A + " and " + B);
            } else {
                System.out.println(C + " is not between " + A + " and " + B);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input should be integer.");
            scanner.nextLine();
        }
    }

    public static void printIntegerCalculationsResult(Scanner scanner) {
        System.out.println("Integers calculation solution.");
        try {
            int a, b;
            System.out.print("Enter integer a: ");
            a = scanner.nextInt();
            System.out.print("Enter integer b: ");
            b = scanner.nextInt();

            int c = a + b;
            System.out.println("SUM is: " + c);

            int d;
            if (a > b) {
                d = a - b;
            } else {
                d = b - a;
            }
            System.out.println("Difference is: " + d);

            int e = a * b;
            System.out.println("Product is: " + e);

            int f;
            if (a > b) {
                f = a % b;
            } else {
                f = b % a;
            }
            System.out.println("Reminder of division is: " + f);

            int g;
            if (a > b) {
                g = a / b;
            } else {
                g = b / a;
            }
            System.out.println("Division is: " + g);

        } catch (InputMismatchException e) {
            System.out.println("Input should be integer.");
            scanner.nextLine();
        }
    }

    public static void printDoubleCalculationsResult(Scanner scanner) {
        try {
            double a, b;

            System.out.print("Enter floating point number a: ");
            a = scanner.nextDouble();

            System.out.print("Enter floating point number b: ");
            b = scanner.nextDouble();

            double c = a + b;
            System.out.println("SUM is: " + c);

            double d;
            if (a > b) {
                d = a - b;
            } else {
                d = b - a;
            }
            System.out.println("Difference is: " + d);

            double e = a * b;
            System.out.println("Product is: " + e);

            double f;
            if (a > b) {
                f = a % b;
            } else {
                f = b % a;
            }
            System.out.println("Reminder of division is: " + f);

            double g;
            if (a > b) {
                g = a / b;
            } else {
                g = b / a;
            }
            System.out.println("Division is: " + g);

        } catch (InputMismatchException e) {
            System.out.println("Input should be a floating point number");
            scanner.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Input should not be 0");
            scanner.nextLine();
        }
    }


    public static void printSortNumbersResult(Scanner scanner) {
        System.out.println("Please enter 2 different numbers. ");
        System.out.print("First number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum < secondNum) {
            System.out.println("Ascending order: " + firstNum + "," + secondNum);
            System.out.println("Descending order: " + secondNum + "," + firstNum);
        } else {
            System.out.println("Ascending order: " + secondNum + "," + firstNum);
            System.out.println("Descending order: " + firstNum + "," + secondNum);
        }
    }


    public static void swapNumbersResult(Scanner scanner) {
        int A, B, C;

        System.out.print("Enter integer number A: ");
        A = scanner.nextInt();

        System.out.print("Enter integer number B: ");
        B = scanner.nextInt();

        System.out.print("Enter integer number C: ");
        C = scanner.nextInt();

        System.out.println("Before swapping: " + A + "," + B + "," + C);

        int temp = A;
        A = B;
        B = C;
        C = temp;

        System.out.println("After swapping: " + A + "," + B + "," + C);

    }


    public static void makeDesisionResult(Scanner scanner) {
        int time = 0;
        double money = 0;
        boolean atWork = false;
        String decision = "";

        System.out.print("Provide the time (0-24): ");
        time = scanner.nextInt();

        if (time < 0 || time > 24) {
            System.out.println("Invalid time. Please provide a time between 0 and 24.");
        }

        System.out.print("Provide amount of money: ");
        money = scanner.nextDouble();

        System.out.print("provide your working status. You are at work (true/false): ");
        atWork = scanner.nextBoolean();

        if (atWork) {
            decision = "I'm at work, I'll be working and won't be able to go out.";
        } else {
            if ((time >= 9 && time <= 20) && money >= 10.00) {
                decision = "It's a day and I have more than 10$. I will go to the cinema.";
            } else if ((time >= 9 && time <= 20) && money < 10.00) {
                decision = "It's a day and I have less than 10$. I'll go for a walk.";
            } else if ((time >= 20 || time < 9) && money >= 20.00) {
                decision = "It's night and I have more than 20$. I will go to a disco.";
            } else if ((time >= 20 || time < 9) && money < 20.00) {
                decision = "It's night and  I have less than 20$. I will go to sleep.";
            }
        }
        System.out.println(decision);
    }

    public static void formFromFourDigitsResult(Scanner scanner) {
        System.out.print("Please enter 1 four-digit natural number from the keyboard that falls within the range [1000 – 9999]: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber < 1000 || inputNumber > 9999) {
            System.out.println("Invalid input. Please enter a four-digit number within the range [1000 - 9999].");
        } else {
            int firstDigit = inputNumber / 1000;
            int secondDigit = (inputNumber / 100) % 10;
            int thirdDigit = (inputNumber / 10) % 10;
            int fourthDigit = inputNumber % 10;

            System.out.println("First two-digit number: " + firstDigit + fourthDigit);
            System.out.println("Second two-digit number: " + secondDigit + thirdDigit);
        }
    }


    public static void multiplyTwoDigitsResult(Scanner scanner) {
        int a, b;
        System.out.print("Enter first natural two-digit number: ");
        a = scanner.nextInt();

        System.out.print("Enter second natural two-digit number: ");
        b = scanner.nextInt();

        int result = a * b;
        boolean isEven = (result % 2 == 0);

        int lastDigit = result % 10;
        boolean isDivisibleBy3 = (lastDigit % 3 == 0);

        System.out.println(result + " - " + (isEven ? "even" : "odd"));
        System.out.println(lastDigit + " is " + (isDivisibleBy3 ? "divisible" : "not divisible") + " by 3.");
    }

    public static void divisibleByEachResult(Scanner scanner) {
        System.out.print("Please enter a three-digit number from the keyboard, without the digit 0 in this number: ");
        int inputNumber = scanner.nextInt();

        try {
            int firstDigit = inputNumber / 100;
            int secondDigit = (inputNumber / 10) % 10;
            int thirdDigit = inputNumber % 10;

            boolean isDivisibleByEachDigit = (inputNumber % firstDigit == 0) && (inputNumber % secondDigit == 0) && (inputNumber % thirdDigit == 0);

            if (isDivisibleByEachDigit) {
                System.out.println("Input number is divisible by each digit in it");
            } else {
                System.out.println("Input number is NOT divisible by each digit in it");
            }
        } catch (ArithmeticException e) {
            System.out.println("Input number should be integer.");
        }
    }

    public static void rainForecastResult(Scanner scanner) {

        System.out.print("Please enter an integer from the keyboard in the range [0-100]: ");
        int humidityInput = scanner.nextInt();
        String message = "";

        if (humidityInput >= 0 && humidityInput <= 100) {
            if (humidityInput == 0) {
                message = "It will not rain";
            } else if (humidityInput <= 5) {
                message = "minimal chance of precipitation";
            } else if (humidityInput <= 20) {
                message = "a small chance of precipitation";
            } else if (humidityInput <= 50) {
                message = " there is a chance of precipitation";
            } else if (humidityInput <= 80) {
                message = "high chance of precipitation";
            } else {
                message = "it will rain";
            }
        } else {
            message = "Invalid input. Please enter a number in the range [0-100]";
        }

        System.out.println(message);
    }

    public static void welcomingHoursResult(Scanner scanner) {
        int hours;
        String welcoming = "";
        while (true) {

            try {
                System.out.print("Please enter a natural number from the keyboard in the range [0-24]: ");
                hours = scanner.nextInt();

                if (hours < 0 || hours > 25) {
                    System.out.println("Invalid hours, please enter in the range [0-24]:");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }

        if (hours >= 5 && hours <= 10) {
            welcoming = "Good morning";
        } else if (hours >= 11 && hours <= 18) {
            welcoming = "Good day";
        } else if (hours >= 19 && hours <= 23) {
            welcoming = "Good evening";
        } else {
            welcoming = "Why aren't you sleeping?";
        }
        System.out.println(welcoming);
    }


    public static void orderChekResult(Scanner scanner) {
        while (true) {

            try {
                System.out.print("Please enter a three-digit natural number: ");
                int number = scanner.nextInt();
                if (number >= 100 && number <= 999) {
                    int digit1 = number / 100;
                    int digit2 = (number / 10) % 10;
                    int digit3 = number % 10;

                    if (digit1 == digit2 && digit2 == digit3) {
                        System.out.println("The numbers are equal.");
                    } else if (digit1 <= digit2 && digit2 <= digit3) {
                        System.out.println("Ascending order.");
                    } else if (digit1 >= digit2 && digit2 >= digit3) {
                        System.out.println("Descending order.");
                    } else {
                        System.out.println("Try with another number.");
                    }
                    break;

                } else {
                    System.out.println("Please enter a three-digit natural number.");
                    scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }
}





