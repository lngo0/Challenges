package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class StudentPQ {
    private final int id;
    private final String name;
    private final double cgpa;

    public StudentPQ(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    private final PriorityQueue<StudentPQ> queue = new PriorityQueue<>(
            Comparator.comparing(StudentPQ::getCGPA).reversed()
                    .thenComparing(StudentPQ::getName)
                    .thenComparing(StudentPQ::getID));

    public List<StudentPQ> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");

                queue.add(new StudentPQ(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            }
        });

        List<StudentPQ> studentPQ = new ArrayList<>();
        while (!queue.isEmpty()) {
            studentPQ.add(queue.poll());
        }

        return studentPQ;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<StudentPQ> studentPQ = priorities.getStudents(events);

        if (studentPQ.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (StudentPQ st: studentPQ) {
                System.out.println(st.getName());
            }
        }
    }
}
