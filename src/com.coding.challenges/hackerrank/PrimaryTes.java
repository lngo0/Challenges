package com.coding.challenges.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimaryTes {
    /*
    A prime number is a natural number greater than  whose only positive divisors are  and itself.
    For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.

    Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

    Input Format

    A single line containing an integer, n (the number to be checked).

    Constraints
        n contains at most 100 digits.
    Output Format
        If n is a prime number, print prime; otherwise, print not prime.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger b = new BigInteger(n);
        System.out.println(b.isProbablePrime(10) ? "prime" : "not prime");

        bufferedReader.close();
    }
}
