package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLIstDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Cow");
        list.add("Dog");
        ((LinkedList<String>) list).addFirst("Goat");
        list.add("Buffalo");
        System.out.println(list);




    }
}

/*class Animal{
    private String name;
}*/
