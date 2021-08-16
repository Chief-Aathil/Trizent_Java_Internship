package com.mycompany.Regex;


import java.util.regex.Pattern;

public class SplitTest {
    public static void main(String[] args) {
        String regex = ":";
        String input = "one:two:three:four";
        Pattern pattern = Pattern.compile(regex);
        String[] output = pattern.split(input);
        for (String str : output) {
            System.out.println(str);
        }
    }
}
