package com.work.allpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastElementOfArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("first Element: "+list.get(0));
        System.out.println("last Element: "+list.get(n-1));
    }
}
