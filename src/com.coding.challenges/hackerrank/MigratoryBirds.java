package com.coding.challenges.hackerrank;

import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    /*
     Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type.
     If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

    Example
       arr = [1,1,2,2,3]
    There are two each of types 1 and 2, and one sighting of type 3. Pick the lower of the two types seen twice: type 1.

    Function Description
        Complete the migratoryBirds function in the editor below.
        migratoryBirds has the following parameter(s):
        int arr[n]: the types of birds sighted
    Returns
        int: the lowest type id of the most frequently sighted birds
    Input Format
        The first line contains an integer, n, the size of arr.
        The second line describes arr as n space-separated integers, each a type number of the bird sighted.

    Constraints
        5 <= n <= 2 x 10^5
    It is guaranteed that each type is 1, 2, 3, 4, or 5.
     */

    public static int migratoryBirds(List<Integer> arr) {
        int result = 1;
        for (int i = 2; i <= 5; i++) {
            if (Collections.frequency(arr, i) > Collections.frequency(arr, result)) {
                result = i;
            }
        }
        return result;
    }

}
