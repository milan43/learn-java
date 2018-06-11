package casting;

public class CastingDemo {
    public static void main(String[] args) {
   /* Animal a = new Animal();
    System.out.println("Animal a = new Animal();");
    a.getType();
    a.getInfo();
    Dog d = new Dog();
    System.out.println("Dog d = new Dog();");
    d.getType();
    d.getInfo();
    Animal a1 = new Dog();
    System.out.println("Animal a1 = new Dog();");
    a1.getType();// This is dog
    a1.getInfo();//(static) Animal contains dog. Here the static method of Dog class is hided i.e. method hiding
    Dog d1 = (Dog)a1;
    System.out.println("Dog d1 = (Dog)a1;");
    d1.getType();//This is dog
    d1.getInfo();//(Static) Dog is an animal

        System.out.println(a1 instanceof Dog);//true
        System.out.println(a1 instanceof Animal);//true
        System.out.println(d1 instanceof Dog);//true
        System.out.println(d1 instanceof Animal);//true
        System.out.println(a instanceof Dog);//false
        System.out.println(d instanceof Animal);//true
*/
/*        Animal animal =  new Animal();
        Dog dog = (Dog)animal;
        System.out.println("Animal animal = new Animal();");
        dog.getType();
        dog.getName();
        dog.getInfo();
        dog.species();*/

        Animal animal1 = new Dog();
        Dog dog1 = (Dog)animal1;
        System.out.println("Animal animal = new Dog();");
        dog1.getType();
        dog1.getName();
        dog1.getInfo();
        dog1.getType();

    }
}
