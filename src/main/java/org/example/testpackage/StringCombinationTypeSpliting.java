package org.example.testpackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCombinationTypeSpliting {


    public static void main(String[] args) {



        String d = "krant Hi ,.{} ,  new world 123 thisgrOUP";

       String[]   f =  d.split("[,+\\s+]");


        Stream<String> stringStream = Arrays.stream(f).map(String::toUpperCase);
        stringStream.forEach(System.out::println);


System.out.println(Arrays.toString(f));


        Map<String, Long> fileteredkeys = Arrays.stream(f).collect(Collectors.groupingBy(e -> e, Collectors.counting()))


                .entrySet()

                .stream()

                .filter(v -> v.getValue()>1)

                .sorted(Map.Entry.comparingByKey())

                .collect(Collectors.toMap(


                        Map.Entry::getKey,
                        Map.Entry::getValue,

                        (e1,e2 )-> e2,

                        LinkedHashMap::new

                ));


        System.out.println(fileteredkeys);



    }
}
