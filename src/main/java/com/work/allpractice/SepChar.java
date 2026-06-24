package com.work.allpractice;

import java.util.Arrays;
import java.util.Scanner;

public class SepChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String l="";
        String c="";
        for (char chh:ch){
            if (Character.isLowerCase(chh)){
                l+=chh;
            }else {
                c+=chh;
            }
        }
        System.out.println("lowercase : "+l);
        System.out.println("uppercase : "+c);
    }
}
