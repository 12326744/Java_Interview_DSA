package com.work.allpractice;

import java.util.Scanner;

public class LargestAndSmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int lar=arr[0];
        int sm=arr[0];

        for (int i = 0; i < n; i++) {
            if(sm>arr[i]){
                sm=arr[i];
            }
            if(lar<arr[i]){
                lar=arr[i];
            }
        }

        System.out.println("smallest: "+sm);
        System.out.println("largest: "+lar);
    }
}
