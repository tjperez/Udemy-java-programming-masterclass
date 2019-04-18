package com.tjlinares;

public class Main {

    public static void main(String[] args) {

        // Data Types: Float & Double

        // width of int = 32 (4 bytes).
        int intValue = 5 / 2;
        // width of float = 32 (4 bytes)
        float floatValue = 5f / 2f;
        // width of double = 64 (8 bytes)
        double doubleValue = 5d / 2d;

        System.out.println("My integer value: " + intValue);
        System.out.println("My float value: " + floatValue);
        System.out.println("My double value: " + doubleValue);

        //Challenge

        int numInPounds = 180;
        double numInKilo = numInPounds * 0.45359237;

        System.out.println(numInKilo);


    }
}
