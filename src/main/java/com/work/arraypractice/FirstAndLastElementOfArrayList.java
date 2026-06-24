package com.work.arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastElementOfArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}
