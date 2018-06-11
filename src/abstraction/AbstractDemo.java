package abstraction;

import java.util.Comparator;

interface Vechile{
    void name();
    void price();


}


public class AbstractDemo{

    public static void main(String[] args) {
        Car car = new MarutiCar();
        car.color();
        car.name();
        car.price();
    }

}

abstract class Car implements Vechile
{
    @Override
    public void name() {
        System.out.println("Car");
    }
    abstract void color();

}

class MarutiCar extends Car{

    @Override
    public void price() {
        System.out.println(1000);
    }

    @Override
    void color() {
        System.out.println("Red");
    }

    @Override
    public void name() {

        System.out.println("Maruti");
    }
}