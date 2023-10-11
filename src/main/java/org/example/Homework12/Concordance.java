package org.example.Homework12;

import java.util.HashMap;
import java.util.Scanner;

public class Concordance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<Character, StringBuilder> concordance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                if (!concordance.containsKey(c)) {
                    concordance.put(c, new StringBuilder());
                }
                concordance.get(c).append(i).append(", ");
            }
        }

        System.out.println("Output:");
        System.out.print("{");
        StringBuilder output = new StringBuilder();
        for (char key : concordance.keySet()) {
            StringBuilder positions = concordance.get(key);
            String positionsStr = positions.substring(0, positions.length() - 2);
            output.append(String.format("%c=[%s], ", key, positionsStr));
        }
        if (output.length() >2) {
            output.setLength(output.length() - 2);
        }

        System.out.print(output.toString());
        System.out.print("}");

    }
}
