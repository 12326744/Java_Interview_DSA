package com.work.tcs_nqt;

import java.util.Scanner;

public class CountVowelsAndConst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.toLowerCase();
        int vc=0;
        int cc=0;

        String vl="";
        String cl="";
        for (char ch:str.toCharArray()){
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
                    vl+=ch;
                    vc++;
                }else{
                    cl+=ch;
                    cc++;
                }
            }
        }
        System.out.println("Vowel letter is "+vl+" and vowel count is "+ vc);
        System.out.println("Consonant letter is "+cl+" and Const count is "+ cc);
    }
}
