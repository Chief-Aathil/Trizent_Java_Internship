package com.mycompany.Regex;

import java.util.regex.Pattern;

public class UsefulFunctions {
    public static void main(String[] args) {
        String input = "test string @ 123";
        String regex = "[a-z]*";
        String quote = Pattern.quote(input); //return literal pattern string
        System.out.println("quote: " + quote);
        Pattern pattern = Pattern.compile(regex);
        System.out.println("compile: " + pattern.toString()); // return string representation of pattern

    }


}
