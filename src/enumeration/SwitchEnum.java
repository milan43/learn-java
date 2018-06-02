package enumeration;

/**
 * enum has been introduced from java 1.5
 * the main advantage of enum is we can create our custom enumerated datatypes
 * enum is also availabe in other languages like C, C
 * enum in Java is more powerful than in other languages
 * java enum can contain variables, methods, constructors
 * enum is a group of named constants
 */

import java.util.List;

/**
 * Internally enum extends abstract Enum class that extends object class
 * enum can acess all the methods of object class
 * we cannot make object of enum because it extends abstract class
 * enum cannot extends other classes due to diamond condition of multiple inheritance
 * enum can implement interfaces
 */
enum Days{
    /**
     * internally enum is converted to class
     * Here enum Days will be conveted as:
     * class Days{
     *     public static final Days SUNDAY = new Days();
     * }
     */
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

}

class EnumDays{
    Days day;
    EnumDays(Days day){
        this.day = day;
    }
    public void showDay(){
        switch (day){
            case SUNDAY:
            System.out.println("Today is Sunday");
            break;
            case MONDAY:
                System.out.println("Today is Monday");
      /*      we cannot define case that is out of enum data type
        case HOLIDAY: shows compile time error*/

        }
    }
}

public class SwitchEnum {
    public static void main(String[] args) {
        EnumDays firstDay = new EnumDays(Days.SUNDAY);
        firstDay.showDay();

        /**
         * @values method is internally provided by jvm
         */
       Days days[] = Days.values();
        for(Days d : days) {
            System.out.println(d +" "+ d.ordinal());//ordinal method shows the order of enum object
        }
    }
}
