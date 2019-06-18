package com.structures.linkedlist;

import com.structures.linkedlist.base.*;

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
        SortedIndexLinkedList<Integer> sortedIndexLinkedList = new SortedIndexLinkedList<Integer>();
        sortedIndexLinkedList.insert(2, 129);
        sortedIndexLinkedList.insert(1, 243);
        sortedIndexLinkedList.insert(3, 454);
        sortedIndexLinkedList.insert(0, 345);
        System.out.println(sortedIndexLinkedList);
        System.out.println(sortedIndexLinkedList.find(3));
        sortedIndexLinkedList.delete(2);
        System.out.println(sortedIndexLinkedList);

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

        System.out.println("-----------------------------------");
        Node[] list = new Node[10];

        for (int i = 0; i < 10; i++) {
           list[i] = new Node<Integer>((int) (Math.random() * 99));
            System.out.print(list[i] + ", ");
        }

        System.out.println();
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<Integer>(list);
        System.out.println(sortedLinkedList);
    }
}
