package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CavityMap {

    static List<String> cavityMap(List<String> grid) {
        for (int i = 1; i < grid.size() - 1; i++) {
            String row = grid.get(i);
            StringBuilder sb = new StringBuilder(row);

            for (int j = 1; j < row.length() - 1; j++) {
                int upper = grid.get(i - 1).charAt(j) - '0',
                        lower = grid.get(i + 1).charAt(j) - '0',
                        left = grid.get(i).charAt(j - 1) - '0',
                        right = grid.get(i).charAt(j + 1) - '0',
                        center = row.charAt(j) - '0';

                if (center > upper
                        && center > lower
                        &&  center > left
                        && center > right) {
                    sb.replace(j, j + 1, "X");
                }
            }

            grid.set(i, sb.toString());
        }
        return grid;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> grid = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            grid.add(sc.nextLine());
        }

        List<String> result = cavityMap(grid);
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
