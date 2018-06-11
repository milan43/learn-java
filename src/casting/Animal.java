package casting;

public class Animal {
    public void getType(){
        System.out.println("This is animal");
    }
    public static void getInfo(){
        System.out.println("(Static) Animal contains dog");
    }
    public  void getName(){
        System.out.println("Dog");
    }
}
class Dog extends Animal{
    @Override
    public void getType(){
        System.out.println("This is dog");
    }

    /**
     * Static mehods cannot be overrided which is called method hiding
     */
    public static void getInfo(){
        System.out.println("(Static) Dog is an animal");
    }

    public void species(){
        System.out.println("Mammel");
    }
}