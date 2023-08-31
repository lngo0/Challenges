package com.coding.challenges.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class NonDivisibleSubsets {

    static int nonDivisibleSubset(int k, List<Integer> s) {
        // Array for storing frequency of modulo
        int[] freq = new int[k];
        Arrays.fill(freq, 0);
        // Fill frequency array with values modulo k
        for (Integer integer : s) {
            freq[integer % k]++;
        }
        // if k is even, then update freq[k/2]
        if (k%2 == 0) {
            freq[k/2] = Math.min(freq[k/2], 1);
        }
        // Initialize result by minimum of 1 or count of numbers giving remainder 0
        int result = Math.min(freq[0], 1);
        // Choose maximum of count of numbers giving remainder i or K-i
        for (int i = 1; i <= k/2 ; i++) {
            result += Math.max(freq[i], freq[k-i]);
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),
            k = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();

        int result = nonDivisibleSubset(k, list);
        System.out.println(result);
    }
}
