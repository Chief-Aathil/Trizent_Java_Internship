package com.mycompany.Regex;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("\nEnter your regex: ");
            input = scanner.nextLine();
            if (input.equals("exit")) break;
            Pattern pattern = Pattern.compile(input);
            System.out.println("\nEnter string to search: ");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean found = false;

            while (matcher.find()) {
                System.out.printf("I found the text" +
                                " \"%s\" starting at " +
                                "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end()
                );
                found = true;
            }
            if (!found) {
                System.out.println("No match found.");
            }
        }
    }
}
