package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class StudentJS {
    private int id;
    private String fname;
    private double cgpa;
    public StudentJS(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<StudentJS> studentJSList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            StudentJS st = new StudentJS(id, fname, cgpa);
            studentJSList.add(st);

            testCases--;
        }
        studentJSList.sort(Comparator.comparing(StudentJS::getCgpa).reversed()
                .thenComparing(StudentJS::getFname).thenComparing(StudentJS::getId));

        for(StudentJS st: studentJSList){
            System.out.println(st.getFname());
        }
    }
}
