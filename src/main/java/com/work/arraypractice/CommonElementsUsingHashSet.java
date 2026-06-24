package com.work.arraypractice;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsUsingHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arr2 = new int[b];   // FIXED
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < b; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
        }

        sc.close();
    }
}