package com.work;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=n;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }

        int sum=0;
        temp=n;
        while(temp!=0){
            int rem=temp%10;
            sum+=(int)Math.pow(rem,count);
            temp/=10;
        }

        if(sum==n){
            System.out.println(n + " is Armstrong number");
        }else {
            System.out.println(n +" is not Armstrong number");
        }

    }
}

//1³ + 5³ + 3³ = 1 + 125 + 27 = 153
