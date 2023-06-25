package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDArrayDS {
    /*
        Given a  2D Array :

                    1 1 1 0 0 0
                    0 1 0 0 0 0
                    1 1 1 0 0 0
                    0 0 0 0 0 0
                    0 0 0 0 0 0
                    0 0 0 0 0 0
          An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:

                    a b c
                      d
                    e f g

          There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in ,
          then print the maximum hourglass sum. The array will always be .

          Example

                    -9 -9 -9  1 1 1
                     0 -9  0  4 3 2
                    -9 -9 -9  1 2 3
                     0  0  8  6 6 0
                     0  0  0 -2 0 0
                     0  0  1  2 4 0

            The  hourglass sums are:

                    -63, -34, -9, 12,
                    -10,   0, 28, 23,
                    -27, -11, -2, 10,
                      9,  17, 25, 18

            The highest hourglass sum is  from the hourglass beginning at row , column :

                    0 4 3
                      1
                    8 6 6

            Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

            Function Description

                Complete the function hourglassSum in the editor below.

                hourglassSum has the following parameter(s):

                int arr[6][6]: an array of integers
            Returns

                int: the maximum hourglass sum
            Input Format

                Each of the  lines of inputs  contains  space-separated integers .

            Constraints
                0 <= row, clo <= 5
                -9 <= arr[i][j] <= 9
            Output Format

                Print the largest (maximum) hourglass sum found in arr.

                Sample Input
                1 1 1 0 0 0
                0 1 0 0 0 0
                1 1 1 0 0 0
                0 0 2 4 4 0
                0 0 0 2 0 0
                0 0 1 2 4 0

                Sample Output
                19
     */
    private static int hourglassSum(List<List<Integer>> arr) {
        int rows = arr.size(),
                cols = arr.get(0).size();
        int result = -63;
        int temp;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                temp = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                                        + arr.get(i+1).get(j+1)
                        + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                result  = Math.max(result, temp);
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println(hourglassSum(arr));
    }
}
