package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrList {
    /*
    Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.
    Try to solve this problem using Arraylist.

    You are given  lines. In each line there are zero or more integers.
    You need to answer a few queries where you need to tell the number located in y^th position of x^th line.

    Take your input from System.in.

    Input Format
        The first line has an integer n. In each of the next n lines there will be an integer q denoting number of integers
            on that line and then there will be d space-separated integers.
            In the next line there will be an integer d denoting number of queries. Each query will consist of two integers x and y.

    Constraints
        1 <= n <= 20000
        0 <= d <= 50000
        1 <= q <= 1000
        1 <= x <= n
        Each number will fit in signed integer.
        Total number of integers in n lines will not cross 10^5.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> al2 = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                int num = sc.nextInt();
                al2.add(num);
            }
            al.add(al2);
        }
        int q = sc.nextInt();;
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(),
                    y = sc.nextInt();
            if (x > al.size() || y > al.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(al.get(x - 1).get(y - 1));
            }
        }
    }
}
