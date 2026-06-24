package com.work.allpractice;

import java.util.Scanner;

public class CountNumOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] arr=str.split(" "); //use --- \\s+  -- to handle multiple spaces
//        int count=0;
//        for(int i=0;i< arr.length;i++){
//            count++;
//        }
//        System.out.println(count);

        System.out.println(arr.length);
    }
}
