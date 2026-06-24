package com.work.stringpractice;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.trim().replaceAll("\\s+","");
        System.out.println(str);
    }
}


//    krishna    sah    kuamr
//krishna sah kuamr


// trim() -> used to remove spaces from the beginning and end of a string

// replaceAll("\\s+", " ") -> used to convert multiple spaces into a single space
