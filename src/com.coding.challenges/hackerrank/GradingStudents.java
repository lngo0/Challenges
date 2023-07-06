package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    /*
    Every student receives a grade in the inclusive range from 0 to 100.
    Any grade less than 40 is a failing grade.
    Sam is a professor at the university and likes to round each student's  according to these rules:
        If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next multiple of 5.
        If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
    Examples
         grade = 84 round to  (85 - 84 is less than 3)
         grade = 29 do not round (result is less than 40)
         grade = 57 do not round (60 - 57 is 3 or higher)
    Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

    Function Description
        Complete the function gradingStudents in the editor below.
        gradingStudents has the following parameter(s):
        int grades[n]: the grades before rounding
    Returns
        int[n]: the grades after rounding as appropriate
    Input Format
        The first line contains a single integer, nn, the number of students.
        Each line  of the  subsequent lines contains a single integer, grades[i].
    */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int mark : grades) {
            if (mark < 38)
                arrayList.add(mark);
            else {
                int multiple = mark / 5 + 1,
                        multi5 = multiple * 5,
                        diff = multi5 - mark;
                if (diff < 3)
                    arrayList.add(multi5);
                else
                    arrayList.add(mark);
            }
        }

        return arrayList;
    }
}
