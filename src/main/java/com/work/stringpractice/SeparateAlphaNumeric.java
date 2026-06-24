package com.work.stringpractice;

import java.util.Scanner;

public class SeparateAlphaNumeric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String letter=" ";
        String digits=" ";
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                letter+=ch;
            }else{
                digits+=ch;
            }
        }
        System.out.println("Letter : "+letter);
        System.out.println("Digits : "+digits);

    }
}
