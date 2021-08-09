package com.mycompany.Classes;

class FirstLevel {
    String str = "First Level";

    class SecondLevel {
        String str = "Second Level";

        public void func(String str) {
            System.out.println("str:  " + str);
            System.out.println("this.str:" + this.str);
            System.out.println("FirstLevel.this.str: " + FirstLevel.this.str);
        }
    }
}

public class Shadowing {

    public static void main(String[] args) {
        FirstLevel obj = new FirstLevel();
        FirstLevel.SecondLevel obj2 = obj.new SecondLevel();
        obj2.func("Passed String");
    }

}
