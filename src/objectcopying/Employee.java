package objectcopying;

import java.io.Serializable;

public class Employee implements Cloneable {
    String name;
    double salary;
    String address;
    int age;

    public Employee(){}

    public Employee(String name, double salary, String address, int age) {
        super();
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
    return (Employee)super.clone();
    }

    @Override

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
