package com.work.summer_pep;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {

        try {

//            FileInputStream fis = new FileInputStream("src/main/java/com/work/summer_pep/data1.txt");
            FileInputStream fis = new FileInputStream("data.txt");

            int data;

            while ((data = fis.read()) != -1) {

                System.out.print((char) data);

            }

            fis.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}