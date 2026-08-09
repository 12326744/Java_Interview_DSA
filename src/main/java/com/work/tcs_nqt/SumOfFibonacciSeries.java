package com.work.tcs_nqt;

import java.util.Scanner;

public class SumOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int first=0,second=1,next;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+first;

            next=first+second;
            first=second;
            second=next;
        }
        System.out.println("Sum of Fibonacci series is "+sum);
    }
}
