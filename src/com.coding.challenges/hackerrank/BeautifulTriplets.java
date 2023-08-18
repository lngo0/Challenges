package com.coding.challenges.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int triplets = 0;
        int[] array = arr.stream().mapToInt(Integer::intValue).toArray();

        for (int a : arr) {
            if (Arrays.binarySearch(array, a + d) >= 0 && Arrays.binarySearch(array, a + d * 2) >= 0)
                triplets++;
        }

        return triplets;
    }
}
