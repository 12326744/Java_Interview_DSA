package com.work.strings;

import java.util.Scanner;

public class SwapTwoString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        String temp=str1;
        str1=str2;
        str2=temp;

        System.out.println("After swapping str1 is "+str1+" abd str2 is "+str2);
    }
}
