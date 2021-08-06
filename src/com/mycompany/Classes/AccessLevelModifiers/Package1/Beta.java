package com.mycompany.Classes.AccessLevelModifiers.Package1;

public class Beta {
    String b_NoModifier = "Beta.NoModifier";
    public String b_Public = "Beta.Public";
    protected String b_protected = "Beta.Protected";
    private String b_private = "Beta.Private";

    public static void main(String[] args) {
        Beta bObj = new Beta();
        System.out.println(bObj.b_NoModifier);
        System.out.println(bObj.b_protected);
        System.out.println(bObj.b_private);
        Alpha aObj = new Alpha();
        System.out.println(aObj.a_NoModifier);
        System.out.println(aObj.a_Protected);
//        System.out.println(aObj.a_Private); //Error: Private members are inaccessible outside class.


    }
}
