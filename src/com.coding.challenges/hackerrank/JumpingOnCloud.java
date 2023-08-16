package com.coding.challenges.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnCloud {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 2 || n == 3) {
            System.out.println(1);
        } else {
            int i = 0, count = 0;
            while (i <= n-2) {
                if( (i+2) < n && arr[i+2] != 1 ) {
                    i += 2;
                    count++;
                } else {
                    i += 1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
