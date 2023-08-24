package com.coding.challenges.hackerrank;

import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nW = in.nextInt(),
                tc = in.nextInt();
        int[] width = new int[nW];

        for (int i = 0; i < width.length; i++) {
            width[i] = in.nextInt();
        }

        for (int t = 0; t < tc; t++) {
            int i = in.nextInt(),
                    j = in.nextInt();
            System.out.println(min(width, i, j));
        }

        in.close();
    }

    static int min(int[] a, int beginIndex, int endIndex) {
        int result = Integer.MAX_VALUE;
        for (int i = beginIndex; i <= endIndex; i++) {
            result = Math.min(result, a[i]);
        }
        return result;
    }

}
