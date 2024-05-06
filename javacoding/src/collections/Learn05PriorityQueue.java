package collections;

import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Learn05PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<Integer>( /*Comparator.reverseOrder()*/);

        //By default PQ(priority queue) has small ele will be having the priority

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq); //ele 12 will be in front and rest are jumbled
                                //bcoz min heap is implemented, its heap datastructure
                                //where smallest ele will be on top

        System.out.println(pq.poll() ); //gives 12 bcoz 12 is on front

        System.out.println(pq); //12 removed and order changeed


        System.out.println(pq.peek()); //returns ele which is ready to remove
    }
}
