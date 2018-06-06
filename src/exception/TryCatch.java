package exception;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(print(i));
    }

    public static int print(int n){
        int result = 0;
        try{
            if(n>5) {
                try {
                     result = n/0;
                } finally {

                }
            }
        }catch (ArithmeticException ex){
            System.err.println(ex.getMessage());
        }

/*       if(n>0){
           System.out.println(n/0);
       }*/
       return result;
    }
}
