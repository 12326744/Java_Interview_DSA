package com.work.allpractice;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsUsingHashSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]= sc.nextInt();
        }

        int m=sc.nextInt();
        int[] arr2=new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i]= sc.nextInt();
        }

        HashSet<Integer> seen=new HashSet<>();
        for (int i = 0; i < n; i++) {
            seen.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            if (seen.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
            }
        }
    }
}
