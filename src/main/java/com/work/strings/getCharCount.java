package com.work.strings;

import java.util.HashMap;
import java.util.Scanner;

public class getCharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();
        char[] chh=str.toCharArray();
        for(char ch:chh){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            if(map.get(ch)>=1){
                System.out.print(ch+""+map.get(ch));
            }
        }
    }
}
