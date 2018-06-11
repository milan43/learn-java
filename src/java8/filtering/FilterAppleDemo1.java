package java8.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAppleDemo1 {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple(120.5, "Green"),
                new Apple(80.3, "Red"),
                new Apple(200.7, "Yellow"));
        FilterAppleDemo1 apple = new FilterAppleDemo1();
        System.out.println(apple.filterByColor(list));
        System.out.println(apple.filterByWeight(list));

    }
    public static List<Apple> filterByColor(List<Apple> apples) {
        List<Apple> listApple = new ArrayList<>();
        for (Apple apple : apples) {
            if ("green".equalsIgnoreCase(apple.getColor())){
                listApple.add(apple);
            }
        }
        return listApple;
    }

    public static List<Apple> filterByWeight(List<Apple> apples){
        List<Apple> listApple = new ArrayList<>();
        for(Apple apple : apples){
            if(apple.getWeight()>100){
                listApple.add(apple);
            }
        }
        return listApple;
    }
}
