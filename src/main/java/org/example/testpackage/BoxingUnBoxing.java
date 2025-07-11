package org.example.testpackage;

public class BoxingUnBoxing {


    public static void main(String[] args) {


        int a = 10; //primitive type


        Integer b = a; //boxing


        int c = b; //unboxing
        Integer b1 = Integer.valueOf(a);

    }
}
