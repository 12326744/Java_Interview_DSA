package com.work.arraypractice;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int sm=arr[0];
        int l=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<sm){
                sm=arr[i];
            }
            if(arr[i]>l){
                l=arr[i];
            }
        }
        System.out.println(sm);
        System.out.println(l);
    }
}
