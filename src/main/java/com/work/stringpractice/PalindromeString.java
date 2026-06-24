package com.work.stringpractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();
        if(str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
