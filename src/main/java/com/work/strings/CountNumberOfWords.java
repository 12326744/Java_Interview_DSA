package com.work.strings;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        String[] s=str.split("\\s+");
        System.out.println(s.length);
    }
}

//trim() --> Removes leading & trailing spaces

//split("\\s+")
//Handles:
//multiple spaces
//tabs
//irregular spacing