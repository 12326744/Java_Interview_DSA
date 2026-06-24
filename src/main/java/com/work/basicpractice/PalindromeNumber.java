package com.work.basicpractice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
}

//12321
//palindrome number
