package java8.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAppleDemo4 {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple(120.5, "Green"),
                new Apple(80.3, "Red"),
                new Apple(200.7, "Yellow"));

        System.out.println("Using Stream");
        long startTIme = System.nanoTime();
        List<Apple> listApple = list.stream()
                .filter(a -> "green".equalsIgnoreCase(a.getColor()))
                .collect(Collectors.toList());
        long endTime = System.nanoTime();
        System.out.println(listApple);
        System.out.println("Time Taken in milisecond  " + (endTime-startTIme)/1000000);

        System.out.println("Using Parallel stream");
        startTIme = System.nanoTime();
        List<Apple> parListApple = list.parallelStream()
                .filter(a -> "green".equalsIgnoreCase(a.getColor()))
                .collect(Collectors.toList());
        endTime = System.nanoTime();
        System.out.println(parListApple);
        System.out.println("Time Taken in milisecond  " + (endTime - startTIme)/1000000);
    }

}
