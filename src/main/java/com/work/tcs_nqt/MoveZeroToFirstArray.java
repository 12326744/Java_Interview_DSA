package com.work.tcs_nqt;

import java.util.Scanner;

public class MoveZeroToFirstArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int j = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;
            }
        }

        while (j >= 0) {
            arr[j] = 0;
            j--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
