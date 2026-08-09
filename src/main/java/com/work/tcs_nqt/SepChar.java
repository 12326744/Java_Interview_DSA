package com.work.tcs_nqt;

import java.util.Scanner;

public class SepChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String lc="";
        String uc="";
        for (char ch:str.toCharArray()){
            if (Character.isLowerCase(ch)){
                lc+=ch;
            }else{
                uc+=ch;
            }
        }
        System.out.println("Lower case is "+lc);
        System.out.println("Upper case is "+uc);
    }
}
