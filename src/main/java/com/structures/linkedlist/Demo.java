package com.structures.linkedlist;

import com.structures.linkedlist.base.FirstLastLinkedList;
import com.structures.linkedlist.base.IndexLinkedList;

public class Demo {

    public static void main(String[] args) {
        IndexLinkedList<Integer> indexLinkedList = new IndexLinkedList<Integer>();
        indexLinkedList.insert(1, 129);
        indexLinkedList.insert(2, 243);
        indexLinkedList.insert(3, 454);
        indexLinkedList.insert(4, 345);
        System.out.println(indexLinkedList);
        System.out.println(indexLinkedList.find(3));
        indexLinkedList.delete(2);
        System.out.println(indexLinkedList);

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
