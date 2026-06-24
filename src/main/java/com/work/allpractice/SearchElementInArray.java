package com.work.allpractice;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        boolean found=false;
        int index=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                found=true;
                index=i;
            }
        }
        if (found){
            System.out.println("element found at the index "+index);
        }else{
            System.out.println("Element not found in any index");
        }
    }
}
