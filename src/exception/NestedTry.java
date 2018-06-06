package exception;

import java.lang.reflect.Array;

public class NestedTry {

    public static void main(String[] args) {
      //  System.out.println("Multiple catch block");
        divide1(new int[]{1,2,3,4,5});
      //  System.out.println("Nested try block");
        divide(new int[]{1,2,3,4,5});
    }
    public static void divide(int num[]){
        try {
            for (int i = 0; i <= num.length; i++) {
                try {
                    System.out.println("nested: "+num[i] / i);
                } catch (ArithmeticException ex) {
                    System.err.println("Arithmetic exception -> Nested try");
                }
            }
            }
               catch (ArrayIndexOutOfBoundsException ex){
                    System.err.println("Array index out of bounds exception -> Nested try");
           }
    }

    public static void divide1(int num[]){
        try{
            for(int i = 0; i<= num.length; i++){
                System.out.println("multiple: "+num[i]/i);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println("Arrayindex out of bounds exception -> Multiple catch");
        } catch (ArithmeticException ex){
            System.err.println("Arithmetic exception -> Multiple catch");
        }
    }
}
