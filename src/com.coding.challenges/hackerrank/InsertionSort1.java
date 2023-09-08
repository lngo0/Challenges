package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort1 {
    static void insertionSort1(int n, List<Integer> arr) {
        n = arr.size() - 2;
        int lastNum = arr.get(arr.size() - 1);

        while (n >= 0 && arr.get(n) > lastNum) {
            arr.set(n + 1, arr.get(n));
            n--;
            arr.forEach(a -> System.out.print(a + " "));
            System.out.println();
        }

        arr.set(n + 1, lastNum);
        arr.forEach(a -> System.out.print(a + " "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        sc.close();

        insertionSort1(n, arr);
    }
}
