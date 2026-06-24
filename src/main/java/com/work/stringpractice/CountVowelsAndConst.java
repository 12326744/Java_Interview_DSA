package com.work.stringpractice;

import java.util.Scanner;

public class CountVowelsAndConst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.toLowerCase();
        char[] ch=str.toCharArray();
        int vowel=0;
        int con=0;
        for(int i=0;i< ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                    vowel++;
                }else{
                    con++;
                }
            }
        }
        System.out.println(vowel);
        System.out.println(con);
    }
}

//Krishna Kumar Sah
//5 --vowel
//10 --const
