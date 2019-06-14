package com.structures.queue;

import com.structures.queue.base.LinkedQueue;

public class Demo {

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
        queue.insert(20);
        queue.insert(40);
        System.out.println(queue);
        queue.insert(60);
        queue.insert(80);
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}
