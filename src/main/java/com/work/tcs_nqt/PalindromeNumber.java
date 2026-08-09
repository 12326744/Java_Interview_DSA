package com.work.tcs_nqt;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int original=n;
        int rev=0;
        while (original!=0){
            int rem=original%10;
            rev=rev*10+rem;
            original/=10;
        }

        if(n==rev){
            System.out.println("palindrome number");
        }else {
            System.out.println("not a palindrome number");
        }
    }
}
