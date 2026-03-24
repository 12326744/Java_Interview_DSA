package com.work;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;

        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(n==rev){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome number");
        }
    }
}

//palindrome number => 12321(reading from both side will be same)
