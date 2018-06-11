package java8.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        System.out.println(System.getProperty("JAVA_HOME"));

       List<Integer> nums = new ArrayList<>();
       nums.add(2);
       nums.add(5);
       nums.add(15);
       nums.add(4);
       nums.add(5);
        System.out.println(nums);

        /**
         * filtering even numbers from list
         */
       /*List<Integer> newNums = nums.stream()
               .filter(n -> n%2 ==0)
               .collect(Collectors.toList());
        System.out.println(newNums);*/

        /**
         * here each element of list is doubled by using map
         */
      /* List<Integer> newNums1= nums.stream().map(n1 ->n1*2).collect(Collectors.toList());
        System.out.println(newNums1);*/

        /**
         * to limit the result to display or to add in new list
         */
/*      nums.stream()
              .filter(n -> n<10)
              .limit(3)
              .forEach(System.out::println);*/

        /**
         * skip skips the first elements as per the parameter
         */
/*        nums.stream()
                .filter(n->n<10)
                .skip(1)
                .limit(3)
                .forEach(System.out::println);*/

            nums.stream()
                    .findFirst();


    }
}
