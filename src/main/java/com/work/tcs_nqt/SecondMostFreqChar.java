package com.work.tcs_nqt;

import java.util.HashMap;
import java.util.Scanner;

public class SecondMostFreqChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int largestFreq = 0;
        int secondLargestFreq = 0;
        char lar=' ';
        char seclar=' ';
        for (char ch:map.keySet()){
            if (map.get(ch)>largestFreq){
                secondLargestFreq=largestFreq;
                seclar=lar;

                largestFreq=map.get(ch);
                lar=ch;
            } else if (map.get(ch) > secondLargestFreq && map.get(ch) < largestFreq) {
                secondLargestFreq=map.get(ch);
                seclar=ch;
            }
        }
        if (secondLargestFreq == 0) {
            System.out.println("Second most frequent character does not exist.");
        } else {
            System.out.println(seclar + " : " + secondLargestFreq);
        }
    }
}
