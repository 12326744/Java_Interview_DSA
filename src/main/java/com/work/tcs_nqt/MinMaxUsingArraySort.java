package com.work.tcs_nqt;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxUsingArraySort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("min element is "+arr[0]);
        System.out.println("max element is "+arr[n-1]);
    }
}
