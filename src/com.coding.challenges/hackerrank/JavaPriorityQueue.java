package com.coding.challenges.hackerrank;

import java.util.PriorityQueue;
import java.util.Scanner;

class StudentPQ {
    int token;
    String name;
    double cgpa;

    StudentPQ(int token, String name, double cgpa) {
        this.token = token;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<StudentPQ> pq = new PriorityQueue<>(
                (s1, s2) -> (s1.cgpa != s2.cgpa) ? (Double.compare(s2.cgpa, s1.cgpa))
                : (!s1.name.equals(s2.name) ? s1.name.compareTo(s2.name) : Integer.compare(s1.token, s2.token)));

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if (command.equals("ENTER")) {
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int token = sc.nextInt();

                pq.offer(new StudentPQ(token, name, cgpa));
            } else if (command.equals("SERVED")) {
                pq.poll();
            }
        }

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                System.out.println(pq.poll().name);
            }
        }

        sc.close();
    }
}
