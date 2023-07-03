package com.coding.challenges.hackerrank;

import java.util.Collections;
import java.util.List;

public class BCakeCandles {
    /*
        You are in charge of the cake for a child's birthday.
        You have decided the cake will have one candle for each year of their total age.
        They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

        Example
         candles = [4, 1, 3, 4]

        The tallest candles are 4 units high. There are 2 of them, so return 2.

        Function Description
            Complete the function birthdayCakeCandles in the editor below.
            birthdayCakeCandles has the following parameter(s):

             int candles[n]: the candle heights
        Returns
            int: the number of candles that are tallest one
        Input Format

        The first line contains a single integer, n, the size of candles[].
        The second line contains n space-separated integers, where each integer i describes the height of candles[i].

        Constraints
            1 <= n <= 10^5
            1 <= candles[i] <= 10^7
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        return Collections.frequency(candles, Collections.max(candles));
    }
}
