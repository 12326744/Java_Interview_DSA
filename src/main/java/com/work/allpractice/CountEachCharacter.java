package com.work.allpractice;

import java.util.HashMap;
import java.util.Scanner;

public class CountEachCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.replace(" ","");
        HashMap<Character,Integer>map=new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch: map.keySet()){
            if(map.get(ch)>=1){
                System.out.println(ch+" : "+map.get(ch));
            }
        }
    }
}
