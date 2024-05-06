package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Learn03LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList(); //LinkedList class implements Queue interface

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        queue.poll(); //poll() removes the first ele

        System.out.println(queue);
    }
}
