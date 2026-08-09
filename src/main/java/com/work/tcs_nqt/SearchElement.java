package com.work.tcs_nqt;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        boolean found=false;
        int index=0;
        for (int i = 0; i < n; i++) {    //TODO linear search
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if (found){
            System.out.println("Element "+target+" found at index "+index);
        }else {
            System.out.println("not found");
        }
    }
}
