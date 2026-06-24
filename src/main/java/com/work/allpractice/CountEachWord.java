package com.work.allpractice;

import java.util.HashMap;
import java.util.Scanner;

public class CountEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] arr=s.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for (String str:arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        for (String str: map.keySet()){
            if(map.get(str)>=1){
                System.out.println(str+" : "+map.get(str));
            }
        }
    }
}
