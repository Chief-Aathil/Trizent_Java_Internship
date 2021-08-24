package com.mycompany.Generics;

import java.util.ArrayList;
import java.util.List;

class Parent {
}

class Child extends Parent {
}

public class Subtypes {
    List<Parent> parentList = new ArrayList<>();
    List<Child> childList = new ArrayList<>();
//    List<Parent> pList = childList;
//    Error:Even though Child is a subtype of Parent, this is not the case for generics

//    List<Child> cList = parentList;
//    Error: actual type parameters must match
}
