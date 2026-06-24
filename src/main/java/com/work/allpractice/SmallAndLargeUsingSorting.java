package com.work.allpractice;

import java.util.Arrays;
import java.util.Scanner;

public class SmallAndLargeUsingSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("smallest: "+arr[0]);
        System.out.println("largest: "+arr[n-1]);
    }
}
