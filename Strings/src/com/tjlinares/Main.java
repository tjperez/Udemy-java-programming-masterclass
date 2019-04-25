package com.tjlinares;

public class Main {

    public static void main(String[] args) {


        //Data Types:
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString  = "I know this stuff!";
        myString = myString + ", but I need to practice.";
        System.out.println(myString);

        String numString = "250";
        numString = numString + "50";
        System.out.println(numString);

        int myInt = 50;
        String lastString = "50";
        lastString = lastString + myInt;
        System.out.println("Last String is: " + lastString);
    }
}
