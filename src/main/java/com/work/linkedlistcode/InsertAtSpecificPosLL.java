package com.work.linkedlistcode;

import java.util.Scanner;

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertAtSpecificPosLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Node4 head=null;
        Node4 tail=null;
        for (int i = 0; i < n; i++) {
            int val=sc.nextInt();
            Node4 node4=new Node4(val);

            if(head==null){
                head=node4;
                tail=node4;
            }else{
                tail.next=node4;
                tail=node4;
            }
        }

        //insert at the specific position
        int pos=sc.nextInt();
        int value=sc.nextInt();
        Node4 node4=new Node4(value);



        //traverse
        Node4 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
