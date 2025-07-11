package org.example.testpackage;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDUPfromStringArrayCharacter {

    public static void main(String[] args) {

        String s = "kranthikumarkatta"; // Original string

        // Convert string to array of characters
        String[] d = s.split("");   // ["k", "r", "a", "n", "t", "h", "i"]

        // Print the array of characters
        System.out.println("Array of characters: " + Arrays.toString(d));   //  [k, r, a, n, t, h, i]


        // Collect frequencies of each character
        Map<String, Long> filtered = Arrays.stream(d)


                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                // Filter out characters that appear more than once
        // .filter(v -> v.getValue() > 1)
//        Then only characters that appear more than once are kept in the filtered map — so the result string would then include
//        only repeating characters, but still only once and in the order of first appearance.
//             //   .filter(v -> v.getValue() > 1)
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


// Convert each Unicode code point to a one-character string
//        s.chars() // -> [114, 97, 116]
//                .mapToObj(c -> String.valueOf((char) c)) // -> ["r", "a", "t"]

        String result = s.chars() // Stream the characters of the original string
                .mapToObj(c -> String.valueOf((char) c)) // Convert int to String


                // here we passing the above stringvakue of c to fikter method rifght??
                .filter(c -> filtered.containsKey(c) && addedCharacters.add(c)) // Filter and track if added
                .peek(c -> System.out.println("Added character: " + c)) // Print every character added
                .collect(Collectors.joining()); // Join the characters into a single string

        // Print the final result string
        System.out.println("Final string with characters appearing more than once (in order): " + result);
    }
}
