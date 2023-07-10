package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DynamicArrays {
    /*
        Declare a 2-dimensional array, "arr", of "n" empty arrays. All arrays are zero indexed.
        Declare an integer "lastAnswer", and initialize it to 0.

        There are  types of queries, given as an array of strings for you to parse:

        Query: 1 x y
        Let idx = '(( x XOR lastAnswer ) % n)'
        Append the integer 'y' to 'arr[idx]'.
        Query: 2 x y
        Let idx = '(( x XOR lastAnswer ) % n)'
        Assign the value 'arr[idx][y % size(arr[idx])' to 'lastAnswer'.
        Store the new value of 'lastAnswer' to an answers array.

        Note:  the bitwise XOR operation, which corresponds to the ^ operator in most languages.
        Finally, 'size(arr[idx])' is the number of elements in 'arr[idx]'

        Function Description:
         Complete the dynamicArray function below.
            dynamicArray has the following parameters:
            - int n: the number of empty arrays to initialize in
            - string queries[q]: query strings that contain 3 space-separated integers

        Returns
            int[]: the results of each type 2 query in the order they are presented
        Input Format
            The first line contains two space-separated integers, , the size of  to create, and , the number of queries, respectively.
            Each of the  subsequent lines contains a query string, .

        Constraints
            1 <= n, q <= 10^5
            0 <= x,y <= 10^5
            It is guaranteed that query type 2 will never query an empty array or index.
        Sample Input
                2 5
                1 0 5
                1 1 7
                1 0 3
                2 1 0
                2 1 1
        Sample Output
                7
                3
        Explanation

        Initial Values:
            n = 2
            lastAnswer = 0
            arr[0] = [ ]
            arr[1] = [ ]

        Query 0: Append 5 to arr[( ( 0 XOR 0 ) % 2 )] = arr[0].
            lastAnswer = 0
            arr[0] = [5]
            arr[1] = [ ]

        Query 1: Append 7 to arr[( ( 1 XOR 0 ) % 2 )] = arr[1].
             arr[0] = [5]
             arr[1] = [7]

        Query 2: Append 3 to arr[( ( 0 XOR 0 ) % 2 )] = arr[0
            lastAnswer = 0
            arr[0] = [5, 3]
            arr[1] = [7]

        Query 3: Assign the value at index 0 of arr[( ( 1 XOR 0 ) % 2 )] = arr[1] to lastAnswer, print lastAnswer.
            lastAnswer = 7
            arr[0] = [5, 3]
            arr[1] = [7]
        Result:
            7
        Query 4: Assign the value at index 1 of arr[( ( 1 XOR 7 ) % 2 )] = arr[1] to lastAnswer, print lastAnswer.
            lastAnswer = 3
            arr[0] = [5, 3]
            arr[1] = [7]
        Result:
            3
     */
    private static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> results = new ArrayList<>();
            arr.add(results);
        }

        for (int i = 0; i < queries.size(); i++) {
            int idx = (queries.get(i).get(1)^lastAnswer) % n;
            if (queries.get(i).get(0) == 1) {
                arr.get(idx).add(queries.get(i).get(2));
            } else {
                lastAnswer = arr.get(idx).get(queries.get(i).get(2) % arr.get(idx).size());
                answers.add(lastAnswer);
            }
        }

        return answers;
    }
}
