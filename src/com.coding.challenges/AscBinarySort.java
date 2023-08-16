package com.coding.challenges;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AscBinarySort {
    public static List<Integer> rearrange(List<Integer> elements) {
        Object[] elArr = elements.stream().map(Integer::toBinaryString).toArray();
        for (int i = 1; i < elArr.length; i++)
        {
            String x = elArr[i].toString();

            // Find location to insert using binary search
            int j = Math.abs(Arrays.binarySearch(elArr, 0, i, x) + 1);

            //Shifting array to one location right
            System.arraycopy(elArr, j, elArr, j+1, i-j);

            //Placing element at its correct location
            elArr[j] = x;
        }

        return elements;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);
        integerList.add(8);
        integerList.add(2);

        System.out.println(rearrange(integerList));
    }
}
