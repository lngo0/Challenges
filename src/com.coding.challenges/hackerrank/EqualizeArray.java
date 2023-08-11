package com.coding.challenges.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeArray {
    /*
    Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.

    Example
        arr = [1,2,2,3]
        Delete the 2 elements 1 and 3 leaving arr = [2,2].
        If both twos plus either the 1 or the 3 are deleted, it takes 3 deletions to leave either [3] or [1].
        The minimum number of deletions is 2.

     Function Description
        Complete the equalizeArray function in the editor below.
        equalizeArray has the following parameter(s):
            int arr[n]: an array of integers
    Returns
        int: the minimum number of deletions required
    Input Format
        The first line contains an integer n, the number of elements in .
        The next line contains n space-separated integers arr[i].
    Constraints
        1 <= n <= 100
        1 <= arr[i] <= 100
    Sample Input
        STDIN       Function
        -----       --------
        5           arr[] size n = 5
        3 3 2 1 3   arr = [3, 3, 2, 1, 3]
    Sample Output
        2
    Explanation
        Delete arr[2] = 2 and arr[3] = 1 to leave arr' = [3,3,3]. This is minimal.
            The only other options are to delete 4 elements to get an array of either [1] or [2].
     */
    public static int equalizeArray(List<Integer> arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer integer : arr) {
            hashMap.put(integer, hashMap.getOrDefault(integer, 0) + 1);
        }
        //find the highest frequency
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            int value = e.getValue();
            if (value > max) {
                max = value;
            }
        }
        // result
        return arr.size() - max;
    }
}
