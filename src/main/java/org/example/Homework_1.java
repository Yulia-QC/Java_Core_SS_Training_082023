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

        double A, B, C;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter A: ");
                A = scanner.nextDouble();

                System.out.print("Enter B: ");
                B = scanner.nextDouble();

                System.out.print("Enter C: ");
                C = scanner.nextDouble();

                if (C == 0) {
                    System.out.println("Set the number, C should not be 0.");
                } else {
                    validInput = true;
                }


                if (C == A && C == B) {
                    System.out.println(C + " equals both " + A + " and " + B);
                } else if (C == A && C > B) {
                    System.out.println(C + " equals " + A + " and is greater than " + B);

                } else if (C == A && C < B) {
                    System.out.println(C + " equals " + A + " and is less than " + B);
                } else if (C == B && C > A) {
                    System.out.println(C + " equals " + B + " and is greater than " + A);
                } else if (C == B && C < A) {
                    System.out.println(C + " equals " + B + " and is less than " + A);
                } else if (C > A && C < B) {
                    System.out.println(C + " is between " + A + " and " + B);
                } else if (C < A && C > B) {
                    System.out.println(C + " is between " + A + " and " + B);
                } else if (C < A) {
                    System.out.println(C + " is less than both " + A + " and " + B);
                } else {
                    System.out.println(C + " is greater than both " + A + " and " + B);
                }

            } catch (InputMismatchException e) {
                System.out.println("Input should be integer.");
                scanner.nextLine();
            }
        }
    }


    public static void printIntegerCalculationsResult(Scanner scanner) {
        System.out.println("Integers calculation solution.");
        while (true) {
            try {

                int a, b;
                do {
                    System.out.print("Enter integer a: ");
                    a = scanner.nextInt();
                    if (a == 0) {
                        System.out.println("Input should not be 0.");
                    }
                } while (a == 0);

                do {
                    System.out.print("Enter integer b: ");
                    b = scanner.nextInt();
                    if (b == 0 || b == a) {
                        System.out.println("Input should not be 0 and different from a.");
                    }
                } while (b == 0 || b == a);

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
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Goodbye!");
    }


    public static void printDoubleCalculationsResult(Scanner scanner) {
        System.out.println("Floating numbers calculation solution.");
        while (true) {
            try {
                double a, b;

                do {
                    System.out.print("Enter floating point number a: ");
                    a = scanner.nextDouble();
                    if (a == 0) {
                        System.out.println("Input should not be 0.");
                    }
                } while (a == 0);

                do {
                    System.out.print("Enter floating point number b: ");
                    b = scanner.nextDouble();
                    if (b == 0 || b == a) {
                        System.out.println("Input should not be 0 and different from a.");
                    }
                } while (b == 0 || b == a);

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
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Goodbye!");
    }


    public static void printSortNumbersResult(Scanner scanner) {
        int a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter number a: ");
                a = scanner.nextInt();

                boolean showMessage = true;
                do {
                    System.out.print("Enter number b different from a: ");
                    b = scanner.nextInt();
                    if (b == a) {
                        if (showMessage) {
                            System.out.println("b should not be equal a, set the different number");
                            showMessage = false;
                        } else {
                            showMessage = true;
                        }
                    }
                }
                while (b == a);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input should be integer. Please try again.");
                scanner.nextLine();
            }
        }
        int[] numbers = {a, b};
        Arrays.sort(numbers);
        System.out.println("Ascending order: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }

        if (numbers[0] < numbers[1]) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }

        System.out.println("Descending order: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }

    }

    public static void swapNumbersResult(Scanner scanner) {
        int A, B, C;
        boolean validInput = false;

        while (!validInput) {

            try {
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
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Input should be integer. Try again.");
                scanner.nextLine();
            }
        }
    }


    public static void makeDesisionResult(Scanner scanner) {
        int time;
        double money;
        boolean atWork;

        while (true) {
            try {
                System.out.print("Provide the time (0-23): ");
                time = scanner.nextInt();

                if (time < 0 || time > 23) {
                    System.out.println("Invalid time. Please provide a time between 0 and 23.");
                    continue;
                }

                System.out.print("Provide amount of money: ");
                money = scanner.nextDouble();

                System.out.print("Are you at work, provide the answer yes/no: ");
                String workStatus = scanner.next();
                atWork = workStatus.equalsIgnoreCase("yes");

                String decision = "";

                if (atWork) {
                    if (time >= 9 && time <= 18) {
                        decision = "I'm at work, and it's a working day between 9 and 18. I'll be working and won't be able to go out.";
                    } else if (time > 18 && time <= 20 && money >= 10.00) {
                        decision = "It's already evening, and I have more than 10$. I will go to the cinema.";
                    } else if (time > 18 && time <= 20 && money < 10.00) {
                        decision = "It's already evening, and I have less than 10$. I will go for a walk.";
                    } else if ((time >= 20 || time < 5) && money >= 20.00) {
                        decision = "It's night and I have more than 20$. I will go to a disco.";
                    } else if (time >= 5 && time < 8) {
                        decision = "It's morning, and I should sleep before work.";
                    } else {
                        decision = "I have no specific plans at this time.";
                    }
                } else {
                    if ((time >= 9 && time <= 20) && money >= 10.00) {
                        decision = "It's a day, and I'm not at work. I have more than 10$. I will go to the cinema.";
                    } else if ((time >= 9 && time <= 20) && money < 10.00) {
                        decision = "It's a day, and I'm not at work. I have less than 10$. I'll go for a walk.";
                    } else if ((time >= 20 || time < 5) && money >= 20.00) {
                        decision = "It's night, and I'm not at work. I have more than 20$. I will go to a disco.";
                    } else if (time >= 5 && time < 8) {
                        decision = "It's morning, and I should sleep before work.";
                    } else {
                        decision = "I have no specific plans at this time.";
                    }
                }
                System.out.println(decision);

                System.out.print("Do you want to make another decision? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Try again.");
                scanner.nextLine();
            }
        }
    }


    public static void formFromFourDigitsResult(Scanner scanner) {
        int inputNumber;
        System.out.print("Please enter 1 four-digit natural number from the keyboard that falls within the range [1000 – 9999]: ");
        inputNumber = scanner.nextInt();

        if (inputNumber < 1000 || inputNumber > 9999) {
            System.out.println("Invalid input. Please enter a four-digit number within the range [1000 - 9999].");
        } else {
            int numDigits = String.valueOf(inputNumber).length();
            if (numDigits != 4) {
                System.out.println("Invalid input. Please enter a four-digit number.");
            } else {
                int[] digits = new int[4];
                for (int i = 3; i >= 0; i--) {
                    digits[i] = inputNumber % 10;
                    inputNumber /= 10;
                }

                int firstTwoDigitNumber = digits[0] * 10 + digits[3];
                int secondTwoDigitNumber = digits[1] * 10 + digits[2];

                System.out.println("First two-digit number: " + firstTwoDigitNumber);
                System.out.println("Second two-digit number: " + secondTwoDigitNumber);

                if (firstTwoDigitNumber > secondTwoDigitNumber) {
                    System.out.println(firstTwoDigitNumber + " > " + secondTwoDigitNumber);
                } else if (firstTwoDigitNumber < secondTwoDigitNumber) {
                    System.out.println(firstTwoDigitNumber + " < " + secondTwoDigitNumber);
                } else {
                    System.out.println(firstTwoDigitNumber + " = " + secondTwoDigitNumber);
                }
            }
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
        int inputNumber;

        while (true) {
            System.out.print("Please enter a three-digit number from the keyboard, without the digit 0 in this number: ");
            inputNumber = scanner.nextInt();

            try {
                if (inputNumber < 111 || inputNumber > 999) {
                    System.out.println("Invalid input. Please enter a three-digit number within the range [111 - 999] without 0 in it.");
                } else {
                    int numDigits = String.valueOf(inputNumber).length();
                    if (numDigits != 3) {
                        System.out.println("Invalid input. Please enter a three-digit number.");
                    } else {
                        boolean hasZero = false;
                        int tempNumber = inputNumber;
                        while (tempNumber > 0) {
                            int digit = tempNumber % 10;
                            if (digit == 0) {
                                hasZero = true;
                                break;
                            }
                            tempNumber /= 10;
                        }
                        if (hasZero) {
                            System.out.println("Please, enter the number without the digit 0 in it.");
                        } else {
                            int[] digits = new int[3];
                            for (int i = 2; i >= 0; i--) {
                                digits[i] = inputNumber % 10;
                                inputNumber /= 10;
                            }
                            int firstNumber = digits[0];
                            int secondNumber = digits[1];
                            int thirdNumber = digits[2];

                            if (firstNumber % secondNumber == 0) {
                                System.out.println("First number is divisible by Second number");
                            } else if (firstNumber % thirdNumber == 0) {
                                System.out.println("First number is divisible by Third number");
                            }
                            if (secondNumber % firstNumber == 0) {
                                System.out.println("Second number is divisible by First number");
                            } else if (secondNumber % thirdNumber == 0) {
                                System.out.println("Second number is divisible by Third number");
                            }
                            if (thirdNumber % firstNumber == 0) {
                                System.out.println("Third number is divisible by First number");
                            } else if (thirdNumber % secondNumber == 0) {
                                System.out.println("Third number is divisible by Second number");
                            } else {
                                System.out.println("There no numbers that could be divisible by each of its digits");
                            }
                            break;
                        }
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("Please, enter the number without the digit 0 in it.");
            }
        }
    }

    public static void rainForecastResult(Scanner scanner) {

        System.out.print("Please enter an integer from the keyboard in the range [0-100]: ");
        int humidityInput = scanner.nextInt();
        String message = "";

        if (humidityInput >= 0 && humidityInput <= 100) {
            if (humidityInput == 0) {
                message = "It will not rain";
            } else if (humidityInput >= 1 && humidityInput <= 5) {
                message = "minimal chance of precipitation";
            } else if (humidityInput > 5 && humidityInput <= 20) {
                message = "a small chance of precipitation";
            } else if (humidityInput > 20 && humidityInput <= 50) {
                message = " there is a chance of precipitation";
            } else if (humidityInput > 50 && humidityInput <= 80) {
                message = "high chance of precipitation";
            } else if (humidityInput > 80 && humidityInput <= 100) {
                message = "it will rain";
            }
        } else {
            message = "Invalid input. Please enter a number in the range [0-100]";
        }

        System.out.println(message);
    }

    public static void welcomingHoursResult(Scanner scanner) {
        int hours;
        while (true) {

            try {
                System.out.print("Please enter a natural number from the keyboard in the range [0-24]: ");
                hours = scanner.nextInt();
                String welcoming = "";

                if (hours >= 5 && hours <= 10) {
                    welcoming = "Good morning";
                } else if (hours >= 11 && hours <= 18) {
                    welcoming = "Good day";
                } else if (hours >= 19 && hours <= 23) {
                    welcoming = "Good evening";
                } else if (hours >= 0 && hours <= 4) {
                    welcoming = "Why aren't you sleeping?";
                } else {
                    welcoming = "Invalid hours, please enter in the range [0-24]:";
                    continue;
                }

                System.out.println(welcoming);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
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





