package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort2 {
    static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                int right = arr.get(i),
                left = arr.get(j);
                if (right < left) {
                    arr.subList(i, i + 1).clear();
                    arr.add(j, right);
                    break;
                }
            }

            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
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

        insertionSort2(n, arr);
    }
}
