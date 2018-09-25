package module7.web;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("null");
        System.out.println(queue);
        queue.offer("one");
        System.out.println(queue);
        queue.offer("two");
        System.out.println(queue);
        queue.offer("three");
        System.out.println(queue);
        queue.offer("four");
        System.out.println(queue);
        queue.offer("five");
        System.out.println(queue);

        System.out.println("\nUse peek:");
        queue.peek();
        System.out.println(queue);

        System.out.println("Use pool:");
        queue.poll();
        System.out.println(queue);

        System.out.println("Use element:");
        queue.element();
        System.out.println(queue);

        System.out.println("Use remove:");
        queue.remove();
        System.out.println(queue);

        System.out.println("Use offer:");
        queue.offer("six");
        System.out.println(queue);


    }
}
