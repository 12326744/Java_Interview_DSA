package com.work.allpractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();

        if(str.equals(rev)){
            System.out.println("palindrome String");
        }else{
            System.out.println("not palindrome String");
        }
    }
}
