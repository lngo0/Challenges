package com.coding.challenges.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Brute force
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            sum = nums[i] + nums[i+1];
            if (sum == target) {
                result = new int[] {i, i+1};
            }
        }
        return result;
    }

    //HashMap
    public static int[] twoSumHM(int[] nums, int target) {
        Map<Integer, Integer> numAtIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer numIndex = numAtIndexMap.get(nums[i]);
            if (numIndex != null) {
                return new int[]{numIndex, i};
            }
            numAtIndexMap.put(target - nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 3, 5};
        int target = 7;

        System.out.println(Arrays.toString(twoSumHM(arr, target)));
    }
}
