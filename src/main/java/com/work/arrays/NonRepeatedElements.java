package com.work.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatedElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num:map.keySet()){   //also we can use---> (int num:arr )
            if(map.get(num)==1){
                System.out.print(num+" ");
            }
        }
    }
}

//        10
//        1 1 2 2 3 3 4 5 6 6
//        4 5 -- output
