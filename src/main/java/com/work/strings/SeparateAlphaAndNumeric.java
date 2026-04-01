package com.work.strings;

import java.util.Scanner;

public class SeparateAlphaAndNumeric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

//        StringBuilder sb=new StringBuilder();
        String letter="";
        String digits="";
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                letter+=ch;
            }else{
                digits+=ch;
            }
        }
        System.out.print("letter : "+ letter);
        System.out.println();
        System.out.print("Digits : "+ digits);
    }
}
