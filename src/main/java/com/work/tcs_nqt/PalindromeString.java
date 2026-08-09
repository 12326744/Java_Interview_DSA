package com.work.tcs_nqt;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder(str);
        String res=sb.reverse().toString();

        if(str.equals(res)){
            System.out.println("palindrome string");
        }else{
            System.out.println("Not a palindrome string");
        }
    }
}
