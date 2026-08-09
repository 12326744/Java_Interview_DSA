package com.work.tcs_nqt;

import java.util.Scanner;

public class SecondSmallestInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] s=str.split("\\s+");
        String smallest=s[0];
        String secondSmallest="";
        for (int i = 1; i < s.length; i++) {
            if (s[i].length() <smallest.length()){
                secondSmallest=smallest;
                smallest=s[i];
            } else if ((secondSmallest.isEmpty() || s[i].length() < secondSmallest.length()) && s[i].length() > smallest.length()) {
                secondSmallest = s[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
