package com.coding.challenges.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivisibleSumPairs {
    /*
        Given an array of integers and a positive integer , determine the number of (i,j) pairs where i < j and i + j is divisible by .

        Example
            ar = [1,2,3,4,5,6]
            k = 5

        Three pairs meet the criteria: [1,4] , [2,3] and [4,6].

        Function Description
        Complete the divisibleSumPairs function in the editor below.
        divisibleSumPairs has the following parameter(s):
            int n: the length of array
            int ar[n]: an array of integers
            int k: the integer divisor
        Returns
        - int: the number of pairs

        Input Format
            The first line contains 2 space-separated integers, n and k.
            The second line contains n space-separated integers, each a value of arr[i].

        Constraints
            2 <= n <= 100
            1 <= k <= 100
            1 <= ar[i] <= 100

        Sample Input

            STDIN           Function
            -----           --------
            6 3             n = 6, k = 3
            1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
        Sample Output
            5


     */
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : ar) {
            int mod = i % k,
                com = (k - mod) == k ? 0 : k - mod;
            if (map.containsKey(com))
                result += map.get(com);

            if (map.containsKey(mod))
                map.put(mod, map.get(mod) + 1);

            if (!map.containsKey(mod))
                map.put(mod, 1);

        }
        return result;
        /*
        int[] tracker = new int[k];
          int result = 0;
          for (int value : ar) {
            int mod = value % k;
            pairs += tracker[(k - mod) % k];
            tracker[mod]++;
          }
          return result;
         */
    }
}
