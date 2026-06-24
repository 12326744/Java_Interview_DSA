package com.work.stringpractice;

import java.util.Scanner;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int zero=0;
        StringBuilder sb=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(ch=='0'){
                zero++;
            }else {
                sb.append(ch);
            }
        }

        for (int i = 0; i < zero; i++) {
            sb.append('0');
        }
        System.out.println(sb);
    }
}

//32400121200 ---ip
//32412120000 ---op
