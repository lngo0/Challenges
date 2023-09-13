package com.coding.challenges.hackerrank;

import java.util.Scanner;

public class CorrectnessAndLoopVariant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++){
            int tmp = arr[i];
            int index = -1;
            for (int j = 0; j < i; j++){
                if (tmp < arr[j]) {
                    index = j;
                    break;
                }
            }
            if (index == -1)
                continue;
            for (int k= i - 1; k >= index; k--){
                arr[k+1] = arr[k];
            }
            arr[index] = tmp;
        }
        for (int f : arr){
            System.out.print(f +" ");
        }
    }
}
