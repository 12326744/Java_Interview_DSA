package com.work;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0, second=1,next;
        for(int i=0;i<n;i++){
            System.out.print(first +" ");
            next=first+second;
            first=second;
            second=next;
        }
    }
}
    // simply swipe the numbers from next to next;
//Fibonacci series =>👉 Each number is the sum of the previous two numbers
