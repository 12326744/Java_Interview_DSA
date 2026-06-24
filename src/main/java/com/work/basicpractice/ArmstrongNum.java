package com.work.basicpractice;

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

        int sum=0;
        original=n;
        while (original!=0){
            int rem=original%10;
            sum+= (int) Math.pow(rem,count);
            original/=10;
        }

        if(sum==n){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
    }
}
