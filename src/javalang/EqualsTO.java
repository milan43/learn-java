package javalang;

public class EqualsTO {

    String s1 ="";
    public static void main(String[] args) {
        Employee emp1 = new Employee(40, "Asha", 400000.00);
        Employee emp2 = new Employee(100, "arjun", 40000000.00);
        Employee emp3 = new Employee(100,"arjun", 40000000.00);
        Employee emp4 = emp1;

        System.out.println(emp1.equals(emp2));//does object reference comparision from equals method of object class
        System.out.println(emp2==emp3);//false
        System.out.println(emp2.equals(emp3));//false
        //after overridding equal method last statement will return true
        //we have overridden method to perform content conparision

        /*By default equals method does refernce comparison for objects
                We can override equals method of object class for content comparision*/

    }


}
