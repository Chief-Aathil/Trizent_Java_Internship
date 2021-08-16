package com.mycompany.Regex;

import java.util.regex.Pattern;

public class MatchesTest {
    public static void main(String[] args) {
        String regex = "[abc]";
        String input = "xaz";
        System.out.println("matches: " + Pattern.matches(regex, input));
        //Pattern.matches() returns true when the entire input matches the regex
    }
}

