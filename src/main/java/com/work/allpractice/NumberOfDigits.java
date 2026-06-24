package com.work.allpractice;

import java.util.*;
public class NumberOfDigits {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int digits=0;
        while(n!=0){
            n/=10;
            digits++;
        }
        System.out.println("digit is "+digits);
    }
}
