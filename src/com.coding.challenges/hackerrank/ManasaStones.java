package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ManasaStones {
    static List<Integer> stones(int n, int a, int b) {
        int A = Math.min(a, b);
        int B = a + b - A;
        int val = A * (n - 1);

        // An - A - Ai + Bi -> A(n - 1) - i(A - B)
        return IntStream.range(0, n)
                .map(i -> val - (i * (A - B)))
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        int n = 0, a = 0, b = 0;

        for (int i = 0; i < tc; i++) {
            n = sc.nextInt();
            sc.nextLine();
            a = sc.nextInt();
            sc.nextLine();
            b = sc.nextInt();
            sc.nextLine();

            List<Integer> result = stones(n, a, b);
            System.out.println(result);
        }

        sc.close();
    }
}