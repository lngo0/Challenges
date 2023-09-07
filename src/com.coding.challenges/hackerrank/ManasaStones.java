package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
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
    public static List<Integer> stones2(int n, int a, int b) {
        List<Integer> results = new ArrayList<>();
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (a == b) {
            return List.of((n - 1) * a);
        }

        for (int i = 0; i < n; i++) {
            results.add(i * max + (n - 1 - i ) * min);
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        int n, a, b;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            n = sc.nextInt();
            sc.nextLine();
            a = sc.nextInt();
            sc.nextLine();
            b = sc.nextInt();
            sc.nextLine();

            List<Integer> result = stones(n, a, b);
            list.add(result);
        }
        for (List<Integer> l : list) {
            System.out.println(l);
        }

        sc.close();
    }
}
