package com.work.summer_pep;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int original=n;
        int rev=0;
        while(original!=0){
            int rem=original%10;
            rev=rev*10+rem;
            original=original/10;
        }
        if(n==rev){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a Palindrome number");
        }
    }
}