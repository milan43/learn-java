package basic;

class Employee{
    public void getName(){
        System.out.println("Name");
    }
    public void getSalary(){
        System.out.println("Salary");
    }
}
class Manager extends Employee{
    @Override
    public void getName() {
        System.out.println("basic.Manager");
    }
}

public class ExcDemo {

    public static void main(String[] args){
    Manager manager = new Manager();
    manager.getName();
    manager.getSalary();

    }

}
