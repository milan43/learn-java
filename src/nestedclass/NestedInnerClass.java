package nestedclass;

import java.util.Collections;

class Outer{
    int i= 10;
    static  int j = 20;
    private static int k = 30;


   static class Inner{
        void display(){
           // System.out.println(i);  error non static cannot be accessed from static method
            System.out.println(j);
            System.out.println(k);
        }
    }
     class Inner2 {
        void display(){
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
        }
    }
}

public class NestedInnerClass {

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inr = new Outer.Inner();
        inr.display();

        Outer.Inner2 inr2 = out.new Inner2();
        inr2.display();

    }
}
