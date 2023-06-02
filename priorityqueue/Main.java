package priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            // los saca de menor a mayor
            System.out.println(queue.poll());
        }
    }
}
