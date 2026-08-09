package com.work.tcs_nqt;

import java.util.Scanner;

public class SwapNum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a is "+a+" and b is "+b);
    }
}
