package com.work.strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse().toString();
            System.out.print(sb+" ");
        }
    }
}

// Reverse word --> firstly divide the words where there is meet the space then reverse it
// and after that print with the space
