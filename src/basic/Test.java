package basic;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        //int d = (a<b)?(a<c)?a:(b<c)?b:c;  compile time error
    //    int d = (a<b)?(a<c)?a:(b<c)?b:c:a;
     //   System.out.println(d);
     //   System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv().get("PATH"));
      //  System.out.println(System.getenv());
      //  System.out.println(System.getProperty("PATH"));


    }
}
