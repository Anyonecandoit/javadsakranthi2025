package org.example.testpackage;

import java.util.*;

public class Combinations {



        public static void main(String[] args) {

            // ------------------ List (ArrayList) ------------------
            List<String> fruits = new ArrayList<>();



            // Add elements
//            fruits.add("apple");
//            fruits.addFirst("dog");
//            fruits.add("banana");
//            fruits.add("cherry");

           System.out.println( "index : " + fruits.get(0));

            // Update an element
            fruits.set(0, "apricot");

            // Get element
            String firstFruit = fruits.get(0);
            System.out.println("First fruit: " + firstFruit); // apricot

            // Size of list
            System.out.println("List size: " + fruits.size()); // 3

            // Check if contains
            boolean containsBanana = fruits.contains("banana");
            System.out.println("Contains 'banana': " + containsBanana); // true

            // Remove element by value
            fruits.remove("cherry");
            System.out.println("List after removing 'cherry': " + fruits); // [apricot, banana]

            // ------------------ Set ------------------
            Set<String> fruitSet = new HashSet<>();

            // Add elements
            fruitSet.add("apple");
            fruitSet.add("banana");
            fruitSet.add("cherry");

            // Check if contains
            boolean containsApple = fruitSet.contains("apple");
            System.out.println("Contains 'apple': " + containsApple); // true

            // Remove element
            fruitSet.remove("banana");
            System.out.println("Set after removing 'banana': " + fruitSet); // [apple, cherry]

            // ------------------ Map ------------------
            Map<Integer, String> fruitMap = new HashMap<>();

            // Add key-value pairs
            fruitMap.put(1, "apple");
            fruitMap.put(2, "banana");
            fruitMap.put(3, "cherry");

            // Get value by key
            String fruitByKey = fruitMap.get(2);
            System.out.println("Fruit with key 2: " + fruitByKey); // banana

            // Check if contains key
            boolean containsKey = fruitMap.containsKey(3);
            System.out.println("Map contains key 3: " + containsKey); // true

            // Remove entry by key
            fruitMap.remove(1);
            System.out.println("Map after removing key 1: " + fruitMap); // {2=banana, 3=cherry}

            // ------------------ Array ------------------
            String[] fruitArray = {"apple", "banana", "cherry"};

            // Access element by index
            System.out.println("First element in array: " + fruitArray[0]); // apple

            // Length of array
            System.out.println("Array length: " + fruitArray.length); // 3

            // Convert array to list
            List<String> fruitListFromArray = Arrays.asList(fruitArray);
            System.out.println("List from array: " + fruitListFromArray); // [apple, banana, cherry]

        }
    }


