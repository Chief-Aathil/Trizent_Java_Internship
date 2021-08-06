package com.mycompany.Classes.AccessLevelModifiers.Package2;

import com.mycompany.Classes.AccessLevelModifiers.Package1.Alpha;

public class Omega {
    public void function() {
        Alpha obj = new Alpha();
        System.out.println(obj.a_Public);
//        System.out.println(obj.a_NoModifier); //Package-private fields inaccessible outside the package
//        System.out.println(obj.a_Protected); // Omega is neither a subclass nor in the same package
//        System.out.println(obj.a_Private);   //Private fields inaccessible outside the class
    }
}
