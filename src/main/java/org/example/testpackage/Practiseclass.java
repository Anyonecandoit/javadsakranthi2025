package org.example.testpackage;


import java.util.*;
import java.util.stream.Collectors;

public class Practiseclass {


    public static void main(String[] args) {


        String s = "kranthi kumar";

       String d =  s.replaceAll("\\s" ,"").toUpperCase();

        System.out.println(d);


       String[] r =  d.split("");

        LinkedHashMap<String, Long> filteredcharacters = Arrays.stream(r)

                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))

                .entrySet()

                .stream()
                //.filter(e -> e.getValue() > 1)

                .collect(Collectors.toMap(
                        Map.Entry::getKey,

                        Map.Entry::getValue,


                        (e1, e2) -> e1,


                        LinkedHashMap::new


                ));


      Set<String>  addedtomap = new LinkedHashSet<>();

        String result =  d.chars()

             .mapToObj(e -> String.valueOf((char)e))
             .filter(e -> filteredcharacters.containsKey(e) && addedtomap.add(e))
             .peek(e -> System.out.println(e))
             .collect(Collectors.joining());

        System.out.println(result);







    }
}
