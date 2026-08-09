package com.work.tcs_nqt;

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] s=str.split("\\s+");
        HashMap<String,Integer> map=new HashMap<>();
        for (int i=0;i<s.length;i++){
            map.put(s[i],map.getOrDefault(s[i],0)+1);

        }

        int count=0;
        String ans="";
        for (String str1:s) {
            if(map.get(str1)>count){
                count=map.get(str1);
                ans=str1;
            }
        }
        System.out.println(ans+" : "+count);
    }

}

