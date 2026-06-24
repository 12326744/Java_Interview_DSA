package com.work.allpractice;

import java.util.Scanner;

public class MoveZeroToFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int zeros=0;
        StringBuilder sb=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(ch=='0'){
                zeros++;
            }else{
                sb.append(ch);
            }
        }

        StringBuilder res=new StringBuilder();
        for (int i = 0; i < zeros; i++) {
            res.append('0');
        }

        res.append(sb);
        System.out.println(res);
    }
}
