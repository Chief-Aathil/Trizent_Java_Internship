package com.mycompany.Classes.AccessLevelModifiers.Package2;

import com.mycompany.Classes.AccessLevelModifiers.Package1.Alpha;

public class AlphaSub extends Alpha {
    public void function() {
        System.out.println(super.a_Protected);
        System.out.println(super.a_Public);
//        System.out.println(super.a_NoModifier); // No Modifier=Package private.
        //    So is inaccessible outside the package
//        System.out.println(super.a_Private);// Error: a_Private is a private field in Alpha
    }

    public static void main(String[] args) {
        AlphaSub obj = new AlphaSub();
        obj.function();

    }
}
