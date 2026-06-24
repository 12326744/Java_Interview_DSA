package com.work.stringpractice;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubStringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        int j = 0;   // left pointer
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // remove duplicates
            while (set.contains(ch)) {
                set.remove(s.charAt(j));
                j++;
            }

            set.add(ch);
            max = Math.max(max, i - j + 1);
        }
        System.out.println(max);
    }
}

//abcabcbb --- ip
//3   --- op
