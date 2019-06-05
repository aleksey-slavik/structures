package com.structures.linkedlist;

public class Demo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(1, 129);
        linkedList.insert(2, 243);
        linkedList.insert(3, 454);
        linkedList.insert(4, 345);
        System.out.println(linkedList);
        System.out.println(linkedList.find(3));
        linkedList.delete(2);
        System.out.println(linkedList);
    }
}
