package com.work.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastElementOfArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("first element: "+list.get(0));
        System.out.println("last element: "+list.get(n-1));


    }
}
