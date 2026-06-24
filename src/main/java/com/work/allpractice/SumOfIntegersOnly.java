package com.work.allpractice;

import java.util.Scanner;

public class SumOfIntegersOnly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
        }

        int sum=0;
        for (int i = 0; i < n; i++) {
            try{
                sum+=Integer.parseInt(arr[i]);
            }catch (NumberFormatException e){

            }
        }

        System.out.println("sum of integers only : "+sum);
    }
}
