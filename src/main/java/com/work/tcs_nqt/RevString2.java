package com.work.tcs_nqt;

import java.util.Scanner;

public class RevString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        String res=sb.reverse().toString();
        System.out.println(res);
    }
}
