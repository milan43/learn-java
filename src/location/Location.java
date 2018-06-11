package location;

import enumeration.SwitchEnum;

import java.util.*;

public class Location {
    public static void main(String[] args) {
        Map<String, String[]> places = new HashMap<>() {
            {
                put("Gulmi", new String[]{"Ridi", "Tamghas", "Khairani", "Santipur"});
                put("Palpa", new String[]{"Tansen", "BataseDada", "Harthok", "Jogipani"});
                put("Kapilvastu", new String[]{"Gorusinge", "Lumbini"});
                put("Dang", new String[]{"Tulsipur", "Ghorai", "Lamahi", "Pakhapani"});
            }
        };

        //  Arrays.stream(places.get("Gulmi")).forEach(System.out::println);
  /*      for (String addr :places.get("Gulmi")){
            System.out.println(addr);
        }*/


        // Scanner scanner= new Scanner(System.in);
        //  String current = scanner.next();


/*        for (Map.Entry<String, String[]> place : places.entrySet())
            district = place.getKey();
        values = place.
                System.out.println(district);
    }*/

/*        for(String key : places.keySet()){
            String district = key;
            String values[] = places.get(key);
            System.out.println("     " + district);
            Arrays.stream(values).forEach(System.out::println);
        }*/
/*        List<String> keys = new ArrayList<>(places.keySet());
        Collections.sort(keys);*/
        // System.out.println(keys);

        //  List<String[]> locations = new ArrayList<>(places.values());
   /*     for(String[] location:locations){

        }*/


/*        System.out.println("Please select operation");
        System.out.println("Input 1 to view all location");
        System.out.println("Input 2 to inpur address");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:*/

/*
                for (String key : places.keySet()) {
                    String district = key;
                    String values[] = places.get(key);
                    System.out.println("     " + district);
                    Arrays.stream(values).sorted().forEach(System.out::println);
                }*/

          /*      break;
            case 2:*/
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your address");
                String place = sc.next();
                // System.out.println(place);
                for (Map.Entry<String, String[]> findPlace : places.entrySet()) {
                    String values = findPlace.getKey();
                  //  Arrays.stream(places.get(values)).filter(value ->value.equalsIgnoreCase(place));
                    for (String value : places.get(values)) {
                        if (value.equalsIgnoreCase(place)) {
                            System.out.println("You are at " + findPlace.getKey());
                            System.out.println("Next place to visit:");
                            String[] sorted = places.get(values);
                            //  Arrays.sort(sorted);
                            Arrays.stream(sorted)
                                    .filter(p -> !p.equalsIgnoreCase(place)).sorted()
                                    .forEach(System.out::println);
                            break;
                        }
                        else if(place.equalsIgnoreCase(values)){
                            System.out.println(values+"!Wow! You will love to visit:");
                            Arrays.stream(places.get(values)).sorted().forEach(System.out::println);
                            break;
                        }

                    }

                }
    }



/*        System.out.println("Enter your address");
        String place = sc.next();
       // System.out.println(place);
        for (Map.Entry<String, String[]> findPlace : places.entrySet()){
            String values = findPlace.getKey();
            for(String value : places.get(values)){

                if(value.equalsIgnoreCase(place)){
                    System.out.println("You are at "+findPlace.getKey());
                    System.out.println("Next place to visit:");
                    String[] sorted = places.get(values);
                  //  Arrays.sort(sorted);
                    Arrays.stream(sorted)
                            .filter(p -> !p.equalsIgnoreCase(place)).sorted()
                            .forEach(System.out::println);
                    break;
                }

            }

        }*/
    }


