package com.work.tcs_nqt;

import java.util.Scanner;

public class HarNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int original=n;
        int sum=0;
        while(original!=0){
            int rem=original%10;
            sum+=rem;
            original/=10;
        }
        if(n%sum==0){
            System.out.println(n+" is a Harshad Number");
        }else{
            System.out.println(n+" is not a Harshad Number");
        }
    }
}
