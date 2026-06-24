package com.work.allpractice;

import java.util.Scanner;

public class CountVowelAndConst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.toLowerCase();
        int v=0;
        int c=0;
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='z'){
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                    v++;
                }else{
                    c++;
                }
            }
        }
        System.out.println("vowels : "+v);
        System.out.println("const : "+c);
    }
}
