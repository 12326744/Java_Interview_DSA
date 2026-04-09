package com.work.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemovesDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashSet<Integer>set=new HashSet<>();
        // first method
        for(int num:arr){
            if(!set.contains(num)){
            System.out.print(num+" ");
                set.add(num);
            }
        }
        // Second Method
//        for (int i = 0; i < n; i++) {
//            set.add(arr[i]);
//        }
//        for (int num : set) {
//            System.out.print(num + " ");
//        }
    }
}
