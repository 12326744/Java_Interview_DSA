package com.work.stringpractice;

import java.util.Scanner;

public class SwapTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        String temp=str1;
        str1=str2;
        str2=temp;
        System.out.println("After swapping str1 is "+str1+" and str2 is "+str2);
    }
}
