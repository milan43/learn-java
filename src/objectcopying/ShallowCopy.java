package objectcopying;

/**
 * Shallow copy simply copies object to new object
 * No new object is created in heap, the new object also points to same address
 * change is one object reflects the changes to all objects that is the shallow copy of
 * the main object
 */

/**
 * dkakdkladkkd
 */
public class ShallowCopy {

    public static void main(String[] args) {
    Employee e = new Employee("Lary", 30000, "Kathmandu",22);

        System.out.println("INITIAL VALUES");
        System.out.println("e -> "+e);
        /**
         * Here the e is copied to e1 so both e and e1 points to same address in head
         */
    Employee e1= e;
        System.out.println("e1 -> "+e1);
/**
 * here change in Employee e1 also reflects to all abject of Employee
 */
    e1.setAddress("Butwal");
    e1.setAge(25);
    e1.setName("Mukesh");
    e1.setSalary(40000);
        System.out.println("AFTER CHANGE");
        System.out.println("e -> "+e);
        System.out.println("e1 -> "+e1);
    }
}

