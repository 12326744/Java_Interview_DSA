package com.work;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<=1) System.out.println("Not a prime number");
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime Number");
        }

        // prime number=A number divisible by 1 or itself. eg(2, 3, 5, 7, 11)
    }
}
