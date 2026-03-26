package com.work.strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        String res=sb.reverse().toString();
        if(str.equals(res)){
            System.out.println(str+ " is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
