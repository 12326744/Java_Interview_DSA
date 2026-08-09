package com.work.summer_pep;

import java.util.HashMap;
import java.util.Scanner;

public class SortCharByFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int max=0;
        for (int value: map.values()){
            if (value>max){
                max=value;
            }
        }

        for (int freq=max;freq>=1;freq--){
            for (char ch : map.keySet()) {
                if (map.get(ch) == freq) {
                    for (int i = 0; i < freq; i++) {
                        System.out.print(ch);
                    }
                }
            }
        }
    }
}

//input: applee
//output:ppeeal
