package com.coding.challenges.hackerrank;

import java.util.List;

public class BetweenTwoSets {
    /*
    There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
        1. The elements of the first array are all factors of the integer being considered.
        (Multiples of first array)
        2. The integer being considered is a factor of all elements of the second array.
        (Factors of second array)
    These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
    Example:
        a = [2, 4]
        b = [16, 32, 96]
        Output: 3
        2 and 4 divide evenly into 4, 8, 12 and 16.
        4, 8 and 16 divide evenly into 16, 32, 96.
        4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.
    Function Description
        Complete the getTotalX function in the editor below. It should return the number of integers that are between the sets.
        getTotalX has the following parameter(s):
            int a[n]: an array of integers
            int b[m]: an array of integers
     Input Format
        The first line contains two space-separated integers, n and m, the number of elements in arrays a and b.
        The second line contains  distinct space-separated integers a[i] where 0 <= i <= m.
        The third line contains  distinct space-separated integers b[j] where 0 <= j <= m.
     */

    static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

    static int getLCM(int n1, int n2) {
        if (n1 == 0 || n2 == 0)
            return 0;
        else {
            int gcd = getGCD(n1, n2);
            return Math.abs(n1 * n2) / gcd;
        }
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int result = 0;

        int lcm = a.get(0);
        for (Integer i : a) {
            lcm = getLCM(lcm, i);
        }

        int gcd = b.get(0);
        for (Integer integer : b) {
            gcd = getGCD(gcd, integer);
        }

        int multiple = 0;
        while (multiple <= gcd) {
            multiple += lcm;

            if (gcd % multiple == 0)
                result++;
        }

        return result;
    }
}
