package com.work.tcs_nqt;

import java.util.Scanner;

public class FactNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        System.out.println("factorial of a number is "+fact);
    }
}
