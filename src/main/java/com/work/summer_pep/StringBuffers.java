package com.work.summer_pep;

import java.util.Scanner;

public class StringBuffers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        sb.append(" sah");
        System.out.println(sb);
    }
}