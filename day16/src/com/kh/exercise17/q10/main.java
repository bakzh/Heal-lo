package com.kh.exercise17.q10;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("떙큐");
        queue.offer("베리");
        queue.offer("감사");
        queue.poll();
        queue.offer("방가");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
