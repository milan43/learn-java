package exception;

import java.util.Scanner;
public class CustomException {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Password");
        String password = s.nextLine();
        System.out.println("Re-enter Password");
        String confirm = s.nextLine();
        s.close();
        checkMatching(password, confirm);
    }

    public static void checkMatching(String password, String confirm) {
        try {
            if (!password.equals(confirm)) {
                throw new PasswordNotMatchedException("Not matched");
            }
        }catch (PasswordNotMatchedException ex){
            System.err.println(ex.getMessage());
            System.out.println("Exception caught");
            //System.err and System.out is carried by two different threads
            //JVM will take care about the ordering the err and out to print data in console

        }
    }
}

class PasswordNotMatchedException extends Exception{

  public PasswordNotMatchedException(){}


    public PasswordNotMatchedException(String s){
        super(s);
        //System.out.println(s);
    }

}
