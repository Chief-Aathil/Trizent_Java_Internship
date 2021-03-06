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

        String str1 = "abc@123";
        String str2 = str1;
        String str3 = "123@abc";
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches(str2));
        System.out.println(str1.matches(str3));

        String[] strArray = str1.split("1");
        System.out.println("\nsplit :");
        for (String s : strArray) {
            System.out.println(s);
        }

        str3 = str3.replace("123", "xyz");
        System.out.println("\nreplace: " + str3);
    }


}
