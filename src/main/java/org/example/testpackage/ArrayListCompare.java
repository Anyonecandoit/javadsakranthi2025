package org.example.testpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListCompare {


    public static void main(String[] args) {
        ArrayList<String>  l1 = new ArrayList<>(Arrays.asList("c", "b", "a","d","f"));

        ArrayList<String>  l2 = new ArrayList<>(Arrays.asList("a", "b", "c","d","e"));

        ArrayList<String>  l3 = new ArrayList<>(Arrays.asList("c", "b", "a","d","f"));
        Collections.sort(l1);
        Collections.sort(l2);
Collections.sort(l3);
        System.out.println(l1.equals(l2));

        System.out.println(l1.equals(l3));

        ArrayList<String>  l4 = new ArrayList<>(Arrays.asList("c", "b", "a","d","f"));

        ArrayList<String>  l5 = new ArrayList<>(Arrays.asList("c", "b", "a","d","e"));

        l4.removeAll(l5);
        System.out.println("l4"+ l4);

       // l5.removeAll(l4);
        System.out.println("l5 ,,,,,," + l5);


        /*
        * 1. removeAll() vs retainAll()
Method	Effect on First List	Effect on Second List	Commonality
removeAll()	Removes all elements from the first list that are also in the second list.	No effect; the second list remains unchanged.	The first list loses the elements that are present in both lists (the common elements).
retainAll()	Keeps only the elements in the first list that are also in the second list.	No effect; the second list remains unchanged.	The first list only retains the elements that are present in both lists (the common elements).
*
* */


        ArrayList<String>  l6 = new ArrayList<>(Arrays.asList("java", "b", "cplus","d","f"));

        ArrayList<String>  l7 = new ArrayList<>(Arrays.asList("java", "b", "a","d","e"));

l6.retainAll(l7);
System.out.println(l6);

    }
}
