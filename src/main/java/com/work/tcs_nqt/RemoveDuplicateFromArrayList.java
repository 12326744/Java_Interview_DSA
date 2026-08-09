package com.work.tcs_nqt;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int i=0;i<n;i++){
            set.add(list.get(i));
        }
        for (int num:set) {
            System.out.print(num+" ");
        }
    }
}
