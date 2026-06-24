package com.work.arraypractice;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        int index=0;

        boolean found=false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if (found){
            System.out.println("Element found at index: "+ index);
        }
    }
}
