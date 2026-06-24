package com.work.allpractice;

import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for (int i = 0; i < n-1; i++) {
            sum+=arr[i];
        }
        int total=n*(n+1)/2;

        int miss=total-sum;
        System.out.println("missing number : "+miss);
    }
}
