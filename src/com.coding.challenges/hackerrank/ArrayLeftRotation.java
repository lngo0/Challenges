package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeftRotation {
    /*
        A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.

        Example
            d = 2
            arr = [1,2,3,4,5]

        After 2 rotations, arr2 = [3,4,5,1,2].

        Function Description

        Complete the rotateLeft function in the editor below.

        rotateLeft has the following parameters:

        int d: the amount to rotate by
        int arr[n]: the array to rotate
        Returns

        int[n]: the rotated array

     */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = d;
        while (i < arr.size()) {
            result.add(arr.get(i));
            i++;
        }

        i = 0;
        while (i < d) {
            result.add(arr.get(i));
            i++;
        }

        return result;
    }
}
