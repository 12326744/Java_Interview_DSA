package com.work.strings;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder();
        char[] chh=str.toCharArray();

        int zeros = 0;
        for(char ch:chh){
            if(ch=='0'){
                zeros++;
            }else{
                sb.append(ch);
            }
        }
        for(int i=0;i<zeros;i++){
            sb.append('0');
        }
        System.out.println("Move zeros to end: "+sb.toString());
    }
}
