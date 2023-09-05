package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FairRations {
    static String fairRations(List<Integer> B) {
        int count = 0;

        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) % 2 != 0) {
                B.set(i, B.get(i) + 1);
                B.set(i + 1, B.get(i + 1) + 1);
                count += 2;
            }
        }

        if (B.get(B.size() - 1) % 2 != 0) {
            return "NO";
        }

        return String.valueOf(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N  = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println(fairRations(list));
    }
}
