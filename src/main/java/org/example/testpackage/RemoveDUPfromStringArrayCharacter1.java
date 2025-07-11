package org.example.testpackage;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDUPfromStringArrayCharacter1 {

    public static void main(String[] args) {

        // List of strings
        List<String> strings = Arrays.asList("kranrthikkatta", "hello", "world", "programming", "java");

        // Iterate through each string in the list
        for (String s : strings) {
            System.out.println("Processing string: " + s);

            // Convert string to array of characters
            String[] d = s.split("");

            // Collect frequencies of each character
            Map<String, Long> filtered = Arrays.stream(d)
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                    .entrySet()
                    .stream()
                    // Filter out characters that appear more than once
                  //  .filter(v -> v.getValue() > 1)
                    // Collect the results into a LinkedHashMap (preserving the order)
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new // This ensures insertion order is preserved
                    ));

            // Print the map with filtered characters and their counts
            System.out.println("Filtered map (characters appearing more than once): " + filtered);

            // Now use streams to collect characters in order of first appearance, avoiding duplicates
            Set<String> addedCharacters = new LinkedHashSet<>();

            String result = s.chars() // Stream the characters of the original string
                    .mapToObj(c -> String.valueOf((char) c)) // Convert int to String
                    .filter(c -> filtered.containsKey(c) && addedCharacters.add(c)) // Filter and track if added
                    .peek(c -> System.out.println("Added character: " + c)) // Print every character added
                    .collect(Collectors.joining()); // Join the characters into a single string

            // Print the final result string
            System.out.println("Final string with characters appearing more than once (in order): " + result);
            System.out.println("-------------------------------");
        }
    }
}
