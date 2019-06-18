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
        Integer[] list = new Integer[10];

        for (int i = 0; i < 10; i++) {
            list[i] = (int) (Math.random() * 99);
            System.out.print(list[i] + ", ");
        }

        System.out.println();
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<Integer>(list);
        System.out.println(sortedLinkedList);

        System.out.println("-----------------------------------");
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(4);
        doublyLinkedList.insertFirst(6);
        doublyLinkedList.insertLast(1);
        doublyLinkedList.insertLast(3);
        doublyLinkedList.insertLast(5);
        System.out.println(doublyLinkedList.displayForward());
        System.out.println(doublyLinkedList.displayBackward());
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteByKey(1);
        System.out.println(doublyLinkedList.displayForward());
        doublyLinkedList.insertAfter(2, 7);
        doublyLinkedList.insertAfter(3, 8);
        System.out.println(doublyLinkedList.displayForward());
    }
}
