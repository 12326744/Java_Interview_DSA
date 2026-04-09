package com.work.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }


        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                System.out.print(num+" ");
            }
        }
    }
}
