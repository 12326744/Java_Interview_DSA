package com.work.strings;

import java.util.Scanner;

public class PermutationStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        permute(str,"");
    }
    static void permute(String str,String prefix){
        if(str.length()==0){
            System.out.println(prefix);
        }else{
            for(int i=0;i<str.length();i++){
                String ans=str.substring(0,i)+str.substring(i+1);
                permute(ans,prefix+str.charAt(i));
            }
        }
    }
}


//abc-->
//abc
//acb
//bac
//bca
//cab
//cba
