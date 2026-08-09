package com.work.tcs_nqt;

import java.util.Scanner;

public class CountNumOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        if (str.isEmpty()){
            System.out.println(0);
        }
        String[] s=str.split("\\s+");
        System.out.println(s.length);
    }
}
