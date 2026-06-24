package com.work.stringpractice;

import java.util.Scanner;

public class CountNumOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        String[] s=str.trim().split("\\s+");
        System.out.println(s.length);
    }
}
