package com.work.strings;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurrencesOFCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();
        char[] s=str.toCharArray();
        for(char ch: s){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch: map.keySet()){
            System.out.println(ch+" : "+ map.get(ch));
        }
    }
}

//its print all the occurrences of characters
//HashMap--> it doesn't maintain the order
