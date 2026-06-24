package com.work.stringpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch:map.keySet()){
            System.out.print(ch);
        }
    }
}
