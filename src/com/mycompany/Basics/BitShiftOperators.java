package com.mycompany.Basics;

public class BitShiftOperators {
    public static void main(String[] args) {
        byte b1 = 0b0000_0010;
        byte b2 = 0b0001_0000;
        byte b3 = (byte) 2;
        String s = String.format("%8S", Integer.toBinaryString(b3 & 0x00FF)).replace(' ', '0');
        System.out.println(s);
        System.out.println(b2 << 2);
        String str = Integer.toBinaryString(b3);
        System.out.println(str.replace(' ', '0'));

    }
}
