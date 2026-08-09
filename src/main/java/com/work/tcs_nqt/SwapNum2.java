package com.work.tcs_nqt;

import java.util.Scanner;

public class SwapNum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After Swapping a is "+a+" and b is "+b);
    }
}
