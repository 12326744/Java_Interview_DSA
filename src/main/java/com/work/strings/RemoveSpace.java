package com.work.strings;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String res=str.replace(" ","");
        System.out.println(res);
    }
}
