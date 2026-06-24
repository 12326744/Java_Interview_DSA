package com.work.allpractice;

import java.util.Scanner;

public class RevEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] s=str.split(" ");
        for (int i=0;i<s.length;i++){
            StringBuilder sb=new StringBuilder(s[i]);
            String rev=sb.reverse().toString();
            System.out.print(rev+" ");
        }
    }
}
