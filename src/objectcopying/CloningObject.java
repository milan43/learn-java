package objectcopying;

/**
 * Clonablr interface should be implemented by model class
 * it also uses deep copy but value is not needed ot copy manually
 */

public class CloningObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e = new Employee("Lary", 30000, "Kathmandu", 22);
        System.out.println("INITIAL VALUES");
        System.out.println("e -> " + e);


        Employee e1 =(Employee) e.clone();
        System.out.println("e1 -> "+e1);

        e1.setAddress("Butwal");
        e1.setAge(25);
        e1.setName("Mukesh");
        e1.setSalary(40000);

        System.out.println("AFTER CHANGE");
        System.out.println("e -> "+e);
        System.out.println("e1 -> "+e1);
    }


}
