package com.work.stringpractice;

import java.util.Scanner;

public class SeparateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String l=" ";
        int countl=0;
        int countu=0;
        String u=" ";
        for (char ch:str.toCharArray()){
            if(Character.isLowerCase(ch)){
                l=l+ch;
                countl++;
            }else{
                u=u+ch;
                countu++;
            }
        }

        System.out.println("lower char is "+l);
        System.out.println(countl);
        System.out.println("upper char is "+u);
        System.out.println(countu);
    }
}
