package com.work.tcs_nqt;

import java.util.Scanner;

public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int evenSum=0;
        int oddSum=0;
        while (n!=0){
           int rem=n%10;

           if(rem%2==0){
               evenSum+=rem;
           }else{
               oddSum+=rem;
           }
           n/=10;
        }
        System.out.println("Even Digits sum is "+evenSum);
        System.out.println("odd Digits sum is "+oddSum);
    }
}
