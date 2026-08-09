package com.work.tcs_nqt;

import java.util.Scanner;

public class LongestWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] s=str.split("\\s+");
        String word=s[0];
        for (int i = 0; i < s.length; i++) {
            if(s[i].length() > word.length()) {
                word = s[i];
            }
        }
        System.out.println(word);
    }
}
