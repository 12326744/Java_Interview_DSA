package com.work.allpractice;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueCharacter1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        LinkedHashSet<Character> seen=new LinkedHashSet<>();
        for (char ch:str.toCharArray()){
            seen.add(ch);
        }

        for (char ch:seen){
            System.out.print(ch+" ");
        }
    }
}
