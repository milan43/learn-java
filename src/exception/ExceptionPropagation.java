package exception;

/**
 * An exception is first thrown from the top of the stack and
 * if it is not caught, it drops down the call stack to the previous method.
 *
 */
public class ExceptionPropagation {
    int a = 10;
    int b = 0;
    int result;

    /**
     * findResult method is calling getResult method so the exception handling responsibility
     * is propagated to this mehtod. Here also there is no any exception handling code
     * now the exception is porpagated to main method which is calling this method
     */
    void findResult()
    {
        try{
        getResult();
    }catch (ArithmeticException ex){
        System.err.println("Handled");
    }
    }

    /**
     * Hero also exception code is searched . Here also exception is not handled so
     * the exception is propagated to its calling method i.e. to findResult
     */
    void getResult(){
        divide();

    }

    /**
     * when divide method is called it tries to find handling code in the method
     * here no exception handling code is not found so the exception handling
     * resopnsibility is propagated to its calling method i.e get Result
     */
    void divide()
    {
            result = a / b;

    }

    /**
     * If the main method contains exception handling code the exception is handled
     * otherwise the exception is propagated to JVM by creating the object of exception
     * with exception related values and shows exception from JVM
     * @param args
     */
    public static void main(String[] args) {

        new ExceptionPropagation().findResult();


/*        try{
            new ExceptionPropagation().findResult();
        }catch (ArithmeticException ex){
            System.err.println("Exception handled");
        }*/

    }
}
