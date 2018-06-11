package java8.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterAppleDemo2 {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple(120.5, "Green"),
                new Apple(80.3, "Red"),
                new Apple(200.7, "Yellow"));
        FilterAppleDemo2 apple = new FilterAppleDemo2();
        System.out.println(apple.filterApples(list, FilterAppleDemo2::isGreenApple));
        System.out.println(apple.filterApples(list, FilterAppleDemo2::isHeavyApple));
    }

    public static boolean isGreenApple(Apple apple){
        return "green".equalsIgnoreCase(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight()>100;
    }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> filterBy){
        List<Apple> listApple = new ArrayList<>();
        apples.forEach(p -> {
            if(filterBy.test(p)){
                listApple.add(p);
            }
        });
        return listApple;
    }
}
