package com.work.allpractice;

import java.util.Scanner;

public class RevString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();
        System.out.println(rev);
    }
}
