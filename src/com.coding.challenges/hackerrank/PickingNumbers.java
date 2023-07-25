package com.coding.challenges.hackerrank;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    /*
        Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to .

        Example
            a = [1,1,2,2,4,4,5,5,5,]
        There are two subarrays meeting the criterion: [1,1,2,2,2] and [4,4,5,5,5]. The maximum length subarray has  elements.

        Function Description
            Complete the pickingNumbers function in the editor below.
            pickingNumbers has the following parameter(s):
            int a[n]: an array of integers
        Returns
            int: the length of the longest subarray that meets the criterion
        Input Format
            The first line contains a single integer , the size of the array .
            The second line contains  space-separated integers, each an .

        Constraints
            2 <= n <= 100
            0 < a[i] < 10
            The answer will be >= 2.
        Sample Input 0:
            6
            4 6 5 3 3 1
        Sample Output 0:
            3
        Explanation 0:
            We choose the following multiset of integers from the array: {4,3,3}.
            Each pair in the multiset has an absolute difference <= 1 (i.e., |4 - 3| = 1 and |3 - 3| = 0),
            so we print the number of chosen integers, 3, as our answer.

        Sample Input 1:
            6
            1 2 2 3 1 2
        Sample Output 1:
            5
        Explanation 1:
            We choose the following multiset of integers from the array: {1,2,2,1,2}.
            Each pair in the multiset has an absolute difference <= 1 (i.e.,|1 - 2| = 1 , |1-1| = 0, and |2-2| = 0),
            so we print the number of chosen integers, 5, as our answer.
     */
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int max = 1;
        int base = a.get(0)+1;
        int count = 1;
        for(int i = 1;i < a.size(); i++) {
            if (a.get(i) <= base) {
                count++;
            } else {
                base = a.get(i)+1;
                max = Math.max(max, count);
                count = 1;
            }
        }

        return Math.max(max, count);
    }
}
