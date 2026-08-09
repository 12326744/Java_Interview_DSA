package com.work.tcs_nqt;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int original=n;
        int count=0;
        while(original!=0){
            original=original/10;
            count++;
        }

        original=n;
        int sum=0;
        while (original!=0){
            int rem=original%10;
            sum+= (int) Math.pow(rem,count);
            original/=10;
        }

        if(n==sum){
            System.out.println(n +" is a Armstrong number");
        }else{
            System.out.println(n +" is not a Armstrong number");
        }
    }
}
