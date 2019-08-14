package cn.imoc.java.ruanqunfeng.think.Container;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TestQueue {

    public static void print(Queue queue) {
        while (queue.peek() != null) {
            System.out.println(queue.remove());
        }
    }

    public static void main(String[] args) {
        Random random = new Random(32);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
        }

        print(queue);

        Collections.reverseOrder();
    }
}
