package com.work.arrays;

import java.util.Scanner;

public class CommonElementsUsingBrute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr2[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
