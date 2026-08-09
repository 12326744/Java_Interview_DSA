package com.work.linkedlistcode;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class TraverseLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Node1 head=null;
        Node1 tail=null;
        for (int i = 0; i < n; i++) {
            int val= sc.nextInt();
            Node1 node1=new Node1(val);

            if (head==null){
                head=node1;
                tail=node1;
            }else{
                tail.next=node1;
                tail=node1;
            }
        }

        // traverse the list
        Node1 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
