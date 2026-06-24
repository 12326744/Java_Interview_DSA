package com.work.allpractice;

import java.util.Scanner;

public class TwicePrintEachLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+""+ch[i]);
        }
    }
}
