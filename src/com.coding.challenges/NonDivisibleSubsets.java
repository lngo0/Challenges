package com.coding.challenges;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
