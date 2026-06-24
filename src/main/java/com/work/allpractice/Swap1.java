package com.work.allpractice;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping a is "+ a+ " and b is "+b);
    }
}
