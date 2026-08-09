package com.work.linkedlistcode;

import java.util.Scanner;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertAtEndLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Node3 head=null;
        Node3 tail=null;
        for (int i = 0; i < n; i++) {
            int val=sc.nextInt();
            Node3 node3=new Node3(val);

            if(head==null){
                head=node3;
                tail=node3;
            }else{
                tail.next=node3;
                tail=node3;
            }
        }

        //insert at the End
        int value=sc.nextInt();
        Node3 node3=new Node3(value);
        tail.next=node3;
        tail=node3;


        Node3 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}


