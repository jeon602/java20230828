package ch15collection.lecture;

import java.beans.Introspector;
import java.util.LinkedList;
import java.util.Queue;

public class C15queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(300);
        queue.offer(500);

        System.out.println("queue.size() = " + queue.poll());
        Integer item1 = queue.poll();


        System.out.println("item1 + " + item1);
    }
}
