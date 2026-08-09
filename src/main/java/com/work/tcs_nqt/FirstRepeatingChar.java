package com.work.tcs_nqt;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        HashMap<Character,Integer>map=new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        String res="";
        for (char ch:str.toCharArray()){
            if (map.get(ch)>1){
                res+=ch;
                break;
            }
        }
        System.out.println("First Repeating char is "+res);
    }
}
