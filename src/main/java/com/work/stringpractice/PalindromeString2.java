package com.work.stringpractice;

import java.util.Scanner;

public class PalindromeString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        String rev="";
        for (int i =ch.length-1; i>=0;i--) {
            rev=rev+ch[i];
        }
        if (str.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
