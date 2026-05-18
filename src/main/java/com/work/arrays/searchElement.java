package com.work.arrays;

import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        boolean found=false;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if(found){
            System.out.print("found at index : "+index+" element is "+arr[index]);
        }else{
            System.out.println("Element not found");
        }
    }
}

// Linear Search---Time Complexity is O(n)
