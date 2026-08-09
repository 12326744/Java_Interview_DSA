package com.work.summer_pep;

class Parent {
    Parent() {
        System.out.println("Default Constructor");
    }
    Parent(int a){
        this();
        System.out.println("parameterized constructor "+ a);
    }
}
public class Abc extends Parent {
    Abc() {
        super(20);
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
}