package abstraction;

/**
 *
 * @author melone
 * abstract class cannot be instantiated
 * abstract class can contain zero or more abstract methods
 * abstract class can contain non abstract methods
 * provides top level of abstraction
 * uses factory pattern to provide abstraction
 * abstract class is inherited by similiar type of related classes
 *
 */

 abstract class Phone {
    /**
     * charge method is abstract so class Phone must be abstract
     * price method need not to be implemented strictly
     * charge must be overrided by all class that inherits Phone class except that
     * inheriting class is abstract
     */
    abstract void charge();
  void price(){
      System.out.println("Price");
  }

}

class Samsung extends Phone{
     @Override
void charge(){
    System.out.println("Samsung is charging");
}


}

class Nokia extends Phone{
     @Override
void charge(){
        System.out.println("Nokia is charging");
    }
}

/**
 * main class to provide abstraction for Samsung and Nokia phone
 */
public class AbstractionDemo {
    public static void main(String[] args) {
        AbstractionDemo ad= new AbstractionDemo();
    Phone p;

    p= new Samsung();
    p.price();
    ad.chargePhone(p);
    p= new Nokia();
    p.price();
    ad.chargePhone(p);

    }

    /**
     *
     * @param p is a parameter of Samsung or Nokia class
     *this chargePhone method charges phone without caring about type of phone
     *          which provides abstraction because used donot have to know about charging process
     *          of both phone they can simply provide Samsung of Nokia object to charge phone.
     */
    public static void chargePhone(Phone p){
        /**
         * calls charge mehtod of respective class as per the type of phone object p
         * that has been provided
         */
        p.charge();
    }


}

