package com.coding.challenges.hackerrank;

import java.lang.reflect.Method;

public class JavaGenerics {
    /*
    Generic methods are a very efficient way to handle multiple datatypes using a single method.
    This problem will test your knowledge on Java Generic methods.
    Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays.
    The method should be able to accept both integer arrays or string arrays.

    You are given code in the editor. Complete the code so that it prints the following lines:

        1
        2
        3
        Hello
        World
    Do not use method overloading because your answer will not be accepted.
     */
    static class Printer
    {
        static void printArray(Object[] array) {
            for (Object o: array) {
                System.out.println(o);
            }
        }

    }
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
