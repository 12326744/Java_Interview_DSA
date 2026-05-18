package com.work.arrays;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("smallest element is "+smallest);
        System.out.println("largest element is "+largest);
    }
}
