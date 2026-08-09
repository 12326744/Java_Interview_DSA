package com.work.tcs_nqt;

import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int smin=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(min > arr[i]){
                smin=min;
                min=arr[i];
            }else if (smin>arr[i] && arr[i]!=min){
                smin=arr[i];
            }
        }

        if (smin==Integer.MAX_VALUE){
            System.out.println("Second Smallest does not exist");
        }else{
            System.out.println(smin);
        }
    }
}
