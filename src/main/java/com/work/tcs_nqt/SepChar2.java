package com.work.tcs_nqt;

import java.util.Scanner;

public class SepChar2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder lc=new StringBuilder();
        StringBuilder uc=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(Character.isLowerCase(ch)){
                lc.append(ch);
            }else{
                uc.append(ch);
            }
        }
        System.out.println("Lower case is "+lc);
        System.out.println("Upper case is "+uc);
    }
}
