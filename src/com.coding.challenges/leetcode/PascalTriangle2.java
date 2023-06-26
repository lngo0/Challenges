package com.coding.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    /*
        Given an integer numRows, return the first numRows of Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

                     1
                   1   1
                  1  2  1
                 1  3  3  1
               1  4  6  4   1

        Input: numRows = 1
        Output: [[1]]

        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]

     */

    static List<Integer> generate(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1; ++i)
            result.add(1);

        for (int i = 1; i < rowIndex; ++i) {
            for (int j = i; j > 0; --j) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
