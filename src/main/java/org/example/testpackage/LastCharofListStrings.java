package org.example.testpackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastCharofListStrings {


    public static void main(String[] args) {


        List<String>  strings  = Arrays.asList("kranthi","kumar","katta");

        List<Character> collect = strings.stream()

                .map(s -> s.charAt(s.length()-1))

                .collect(Collectors.toList());

        collect.forEach(System.out::println);


        List<Character> firstchars = strings.stream()

                .map(s -> s.charAt(0))

                .collect(Collectors.toList());

        firstchars.forEach(System.out::println);


        List<Character> middlechar = strings.stream()

                .map(s -> s.charAt(s.length() / 2))

                .collect(Collectors.toList());

        middlechar.forEach(System.out::println);







    }
}
