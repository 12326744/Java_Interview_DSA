package com.work.strings;

import java.util.Scanner;

public class Palindrome2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch=str.toCharArray();
        String res="";
        for (int i=ch.length-1;i>=0;i--){
            res+=ch[i];
        }

        if(str.equals(res)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }

}
