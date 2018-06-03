package javalang;
import java.lang.*;

import java.lang.reflect.Method;

public class PrintMethods {
    public static void main(String[] args) throws ClassNotFoundException {
       Method methods[] = Class.forName("java.lang.Object").getDeclaredMethods();
       for(Method method:methods){
           System.out.println(method);
       }

    }
}
