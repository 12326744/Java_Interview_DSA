package com.work.tcs_nqt;

import java.util.Scanner;

public class TargetFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();


        boolean found=false;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.print("pair found ");
                    System.out.print(arr[i]+" "+ arr[j]);
                    found=true;
                    break;
                }
            }
            if (found) break;
        }
        if(!found){
            System.out.println("pair not found");
        }
    }
}
