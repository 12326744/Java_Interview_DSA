package com.work.tcs_nqt;

import java.util.Scanner;

public class SumIntegersOnly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
        }

        int sum=0;
        for (String str:arr){
            try {
                sum+=Integer.parseInt(str);
            }catch (NumberFormatException e){

            }
        }
        System.out.println("Sum of Integers only : "+sum);
    }
}
