package com.coding.challenges.hackerrank;

import java.util.List;

public class DiagonalDifference {

    /*
        For example, the square matrix  is shown below:
                1 2 3
                4 5 6
                9 8 9
        The left-to-right diagonal 1+5+9 = 15. The right to left diagonal 3+5+9 = 17.
        Their absolute difference is |15 - 17| = 2.

        Function description

        Complete the function diagonalDifference takes the following parameter:

        int arr[n][m]: an array of integers
        Return
            int: the absolute diagonal difference
        Input Format
            The first line contains a single integer, , the number of rows and columns in the square matrix .
            Each of the next  lines describes a row, , and consists of  space-separated integers .
        Constraints
            -100 <= arr[i][j] <= 100
        Output Format
            Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int size = arr.get(0).size(),
                sum1 = 0, sum2 = 0;
        for (int i=0; i < size; i++) {
            for (int j=0; j < size; j++) {
                if (i == j) {
                    sum1 += arr.get(i).get(j);
                }
            }
        }

        int i = 0,
                j = size - 1;
        while (i < size && j > -1) {
            sum2 += arr.get(i).get(j);
            i++;
            j--;
        }
        return Math.abs(sum1 - sum2);
    }
}
