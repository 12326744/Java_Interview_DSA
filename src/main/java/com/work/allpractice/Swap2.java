package com.work.allpractice;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping a is "+a+" and b is "+b);
    }
}
