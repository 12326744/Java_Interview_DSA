package com.work.strings;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

//        StringBuilder lc=new StringBuilder();
//        StringBuilder up=new StringBuilder();
        String lower="";
        String upper="";
        char[] chh=str.toCharArray();
        Arrays.sort(chh);
        for(char ch:chh){
            if(Character.isLowerCase(ch)){
                lower+=ch;
            }else{
                upper+=ch;
            }
        }
        System.out.print("LowerCase char : "+ lower);
        System.out.println();
        System.out.print("UpperCase char : "+ upper);
    }
}
