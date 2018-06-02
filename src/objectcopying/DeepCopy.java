package objectcopying;



public class DeepCopy {
    public static void main(String[] args) {
        Employee e = new Employee("Lary", 30000, "Kathmandu",22);
        System.out.println("INITIAL VALUES");
        System.out.println("e -> "+e);

        Employee e1 = new Employee();
        e1.address=e.address;
        e1.age= e.age;
        e1.salary=e.salary;
        e1.name= e.name;

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
