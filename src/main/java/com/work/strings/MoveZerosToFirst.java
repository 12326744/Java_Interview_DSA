package com.work.strings;

import java.util.Scanner;

public class MoveZerosToFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count=0;
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                count++;
            } else {
                sb.append(ch);
            }
        }
        String result = "0".repeat(count) + sb.toString();

        System.out.println("Output: " + result);
    }
}