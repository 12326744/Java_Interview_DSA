package com.work.linkedlistcode;

import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertAtBeginningLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Node2 head=null;
        Node2 tail=null;

        for (int i = 0; i < n; i++) {
            int val= sc.nextInt();
            Node2 node2=new Node2(val);
            if(head==null){
                head=node2;
                tail=node2;
            }else {
                tail.next=node2;
                tail=node2;
            }
        }

        // Insert at the beginning
        int value= sc.nextInt();
        Node2 node2=new Node2(value);
        node2.next=head;
        head=node2;

        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
