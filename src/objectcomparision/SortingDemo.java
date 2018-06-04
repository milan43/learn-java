package objectcomparision;

import com.sun.jdi.ObjectCollectedException;

import java.util.*;

public class SortingDemo {
    public static void main(String[] args) {
        Product p1= new Product(1, "Ramba", 20.0);
        Product p2= new Product(2, "Ruchi", 20.0);
        Product p3= new Product(3, "Rara", 20.0);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        System.out.println(products);
       // Collections.sort(products, new Product());
       // System.out.println(products);

        List<String> list= new ArrayList<>(Arrays.asList("Ram", "Hari", "Shyam"));
        //using java *
        Collections.sort(products, (a, b) -> a.name.compareToIgnoreCase(b.name)

        );
        products.forEach(p -> System.out.println(p));

/*        String [] names = {"Ram", "Hari", "Shyam"};
        Arrays.sort(names);
        for(String name: names) {
            System.out.println(name);
        }*/
        List<Integer> ids = new ArrayList<>();
        //Arrays.sort is only for sorting an array whereas collection.sort is for sorting collections

        /**
         * Collections.sort internally uses comparable for natural order sorting so to use
         * natural order sorting we need not have to implement comparateor interface
         */
    /*    Collections.sort(list);
        System.out.println(list);*/
    }
}

class Product implements Comparator<Product> {
    int id;
    String name;
    double price;

    public Product(){

    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compare(Product o1, Product o2) {
     int i = o1.name.compareTo(o2.name);
     if(i==0){
         return 0;
     }
     else if(i>0){
         return -1;
     }
     else{
         return 1;
     }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
