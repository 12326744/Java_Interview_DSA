package com.work.tcs_nqt;

import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        int pcount=0;
        int ncount=0;
        int zcount=0;

        for (int i = 0; i < n; i++) {
            if (arr[i]>0){
                pcount++;
            }else if (arr[i]<0){
                ncount++;
            } else if (arr[i]==0) {
                zcount++;
            }
        }
        System.out.println("Pos count : "+pcount);
        System.out.println("Neg count : "+ncount);
        System.out.println("Zero count : "+zcount);
    }
}
