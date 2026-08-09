package com.work.tcs_nqt;

import java.util.Scanner;

class IndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack=sc.nextLine();
        String needle=sc.nextLine();

        int res=haystack.indexOf(needle);
        System.out.println(res);
    }
}



/*
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
 */