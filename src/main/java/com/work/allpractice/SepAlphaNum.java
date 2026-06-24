package com.work.allpractice;

import java.util.Scanner;

public class SepAlphaNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String let="";
        String dig="";
        for (char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                let+=ch;
            }else{
                dig+=ch;
            }
        }

        System.out.println("letter is "+let);
        System.out.println("Digits is "+dig);
    }
}
