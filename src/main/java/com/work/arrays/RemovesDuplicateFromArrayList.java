package com.work.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemovesDuplicateFromArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        HashSet<Integer> set=new HashSet<>();
        for(int num:list){
            if(!set.contains(num)){
                System.out.print(num+" ");
                set.add(num);
            }
        }
    }
}
