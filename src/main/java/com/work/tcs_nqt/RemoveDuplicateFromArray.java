package com.work.tcs_nqt;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for (int num:arr){
            set.add(num);
        }
//        int count=0;
        for (int num:set){
//            count++;
            System.out.print(num+" ");
        }
//        System.out.println(count);
    }
}
