package org.example.testpackage;

import java.util.Arrays;

public class StringConversions {


    public static void main(String[] args) {



        String s = "kranthi";

      String[]  c =   s.split("");
        System.out.println(Arrays.toString(c));

       Arrays.stream(c)

               .map(String::toUpperCase)
               .forEach(System.out::println);


       s.chars().forEach(System.out::println);


       // this still INTEGER ONLY IT TRANSFORMS
       s.chars().map( r -> (char) r)

               .forEach(System.out::println);

       //this will convert the INTEGER INTO CHARACTER
       s.chars()

               .mapToObj( f -> (char) f)

               .forEach(System.out::println);








    }
}
