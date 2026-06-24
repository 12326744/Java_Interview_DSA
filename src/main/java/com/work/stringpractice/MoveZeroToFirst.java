package com.work.stringpractice;

import java.util.Scanner;

public class MoveZeroToFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int zero=0;
        StringBuilder sb=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(ch=='0'){
                zero++;
            }else{
                sb.append(ch);
            }
        }

        StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < zero; i++) {
            sb2.append('0');
        }
        sb2.append(sb);

        System.out.println(sb2);
    }
}
