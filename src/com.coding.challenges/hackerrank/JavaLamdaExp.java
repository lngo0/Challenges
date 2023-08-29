package com.coding.challenges.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaLamdaExp {
    interface PerformOperation {
        boolean check(int number);
    }

    static PerformOperation isOdd() {
        return number -> number % 2 != 0;
    }

    static PerformOperation isPrime() {
        return number -> BigInteger.valueOf(number).isProbablePrime(1);
    }

    static PerformOperation isPalindrome() {
        return number -> String.valueOf(number).contentEquals(new StringBuilder(String.valueOf(number)).reverse());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int cmd = sc.nextInt();
            int num = sc.nextInt();

            switch (cmd) {
                case 1 -> System.out.println(isOdd().check(num) ? "ODD" : "EVEN");
                case 2 -> System.out.println(isPrime().check(num) ? "PRIME" : "COMPOSITE");
                case 3 -> System.out.println(isPalindrome().check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        sc.close();
    }
}
