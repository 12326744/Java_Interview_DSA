package com.work.strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        LinkedHashSet<Character> seen=new LinkedHashSet<>();
        char[] s=str.toCharArray();
        for(char ch:s){
            seen.add(ch);
        }

        for(char ch:seen){
            System.out.print(ch+" ");
        }
    }
}
