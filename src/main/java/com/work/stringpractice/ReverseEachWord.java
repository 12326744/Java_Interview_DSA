package com.work.stringpractice;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb=new StringBuilder(arr[i]);
            sb.reverse().toString();
            System.out.print(sb+" ");
        }


    }
}


//krishna sah --ip
//anhsirk has --op
