package com.work.linkedlistcode;

class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreationLL {
    public static void main(String[] args) {

        Nodes head = new Nodes(10);
        Nodes second = new Nodes(40);
        Nodes third = new Nodes(70);

        head.next = second;
        second.next = third;

        Nodes temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}