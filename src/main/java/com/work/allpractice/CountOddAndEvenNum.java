package com.work.allpractice;

import java.util.Scanner;

public class CountOddAndEvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int Evencount=0;
        int Oddcount=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                Evencount++;
            }else{
                Oddcount++;
            }
        }

        System.out.println("Even count is "+Evencount);
        System.out.println("Odd count is "+Oddcount);
    }
}
