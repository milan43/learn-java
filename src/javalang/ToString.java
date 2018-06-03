package javalang;

public class ToString {
    public static void main(String[] args) {
        Employee emp1 = new Employee(40, "Asha", 100000.00);
        Employee emp2 = new Employee(15, "arjun", 40000.00);
        /**
         * All the objects internally calls toString method that uses hashcode that returns hex value
         * when we print object, it print as Classname@hex code
         * here we show output javalang.Employee@hexa decimal value
         * toString is one method of java.lang package
         */
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
