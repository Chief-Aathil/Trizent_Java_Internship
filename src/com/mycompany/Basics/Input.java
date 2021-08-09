package com.mycompany.Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inpString = inp.nextLine();
        System.out.println("Enter a no: ");
        int inpInt = inp.nextInt();
        System.out.println("inpString: " + inpString);
        System.out.println("inpInt: " + inpInt);
    }


}
