package com.work.summer_pep;

public class Fib {
    public static void main(String[] args) {
        int n=6;

        int a=0,b=1;
        int sum=0;
        for(int i=0; i<n; i++)
        {
            System.out.print(a+" ");
            sum+=a;
            int temp = a + b;
            a = b;
            b = temp;

        }
        System.out.println();
        System.out.println(sum);

    }
}
