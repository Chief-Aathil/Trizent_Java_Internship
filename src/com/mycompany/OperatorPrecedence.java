package com.mycompany;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int x=2,y,z;
        y= (x--) * (++x);
        x=2;
        z=++x * x--;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

    }
}
