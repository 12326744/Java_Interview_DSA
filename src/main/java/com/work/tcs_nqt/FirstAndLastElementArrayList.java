package com.work.tcs_nqt;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastElementArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("first element is "+list.get(0));
        System.out.println("last element is "+list.get(n-1));
    }
}
