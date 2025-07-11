package org.example.testpackage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSpaceConverttoSingleString {

    public static void main(String[] args) {


        // this is one of the form where we can convert multiple word of type  string into a  single string
        String s = " krAnTHi KumaR K";

       String withoutspacesandgapsandspecialchars =  s.replaceAll("\\s+","").toUpperCase();


        System.out.println("withoutspacesandgapsandspecialchars" + withoutspacesandgapsandspecialchars);
      String[]   e  =   withoutspacesandgapsandspecialchars.split("");

     System.out.println(Arrays.toString(e));


     // now suppose if we got multiple string given as a list then we need to convert each string into palidnrome or any other form


        List<String> nameslist  = new ArrayList<>( Arrays.asList("kranthi","kumar","katta"));

        for(String v : nameslist){


            System.out.println(v);




        }



    }

}

