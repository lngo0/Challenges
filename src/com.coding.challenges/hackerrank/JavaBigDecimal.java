package com.coding.challenges.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    /*
        Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
        Each number must be printed in the exact same format as it was read from stdin,
        meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g., ),
        then they must be listed in the same order as they were received as input).

        Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

        Input Format

        The first line consists of a single integer,n , denoting the number of integer strings.
        Each line i of the n subsequent lines contains a real number denoting the value of .

        Constraints
            1 <= n <= 200
            Each si has at most 300 digits.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        Comparator<String> mc = (o1, o2) -> {
            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);
            return b.compareTo(a);
        };
        Arrays.sort(s, 0, n, mc);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
