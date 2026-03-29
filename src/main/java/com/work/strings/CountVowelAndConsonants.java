package com.work.strings;

import java.util.Scanner;

public class CountVowelAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.toLowerCase();
        char[] ch=str.toCharArray();
        int countv=0;
        int countc=0;
        for(int i=0;i<ch.length;i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    countv++;
                } else {
                    countc++;
                }
            }
        }
        System.out.println("vowel count is "+countv);
        System.out.println("consonant count is "+countc);
    }
}
