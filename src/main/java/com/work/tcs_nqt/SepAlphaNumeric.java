package com.work.tcs_nqt;

import java.util.Scanner;

public class SepAlphaNumeric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder alpha=new StringBuilder();
        StringBuilder num=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                alpha.append(ch);
            } else if (Character.isDigit(ch)) {
                num.append(ch);
            }
        }
        System.out.println("aplha : "+alpha);
        System.out.println("num : "+num);
    }
}
