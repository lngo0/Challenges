package com.coding.challenges.hackerrank;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    /*
        Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

        Example
        arr = [1, 3, 5, 7, 9]
        The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9 = 24.
        The function prints
            16 24

        Complete the miniMaxSum function in the editor below.

            miniMaxSum has the following parameter(s):

            arr: an array of  integers
        Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.
        (The output can be greater than a 32-bit integer.)
     */
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long sum = 0;
        for (Integer integer : arr) sum += integer;
        long low_sum = sum - arr.get(arr.size() - 1);
        long high_sum = sum - arr.get(0);

        System.out.println(low_sum + " " + high_sum);
    }
}
