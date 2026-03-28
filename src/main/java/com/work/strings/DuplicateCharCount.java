package com.work.strings;

import java.util.*;

public class DuplicateCharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();;

        Map<Character, Integer> map = new HashMap<>();
        char[] s=str.toCharArray();
        for (char ch : s) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " = " + map.get(ch));
            }
        }
    }
}

// it print only the duplicate characters whose count > 1.
