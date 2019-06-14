package com.structures.linkedlist;

import com.structures.linkedlist.base.FirstLastLinkedList;
import com.structures.linkedlist.base.LinkedList;

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

        System.out.println("-----------------------------------");
        FirstLastLinkedList<Integer> firstLastLinkedList = new FirstLastLinkedList<Integer>();
        firstLastLinkedList.insertFirst(22);
        firstLastLinkedList.insertFirst(44);
        firstLastLinkedList.insertFirst(66);
        firstLastLinkedList.insertLast(11);
        firstLastLinkedList.insertLast(33);
        firstLastLinkedList.insertLast(55);
        System.out.println(firstLastLinkedList);
        firstLastLinkedList.deleteFirst();
        firstLastLinkedList.deleteFirst();
        System.out.println(firstLastLinkedList);
    }
}
