package com.work.allpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(!set.contains(list.get(i))){
                set.add(list.get(i));
                System.out.print(list.get(i)+" ");

            }
        }
    }
}
