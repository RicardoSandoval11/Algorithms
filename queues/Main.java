package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Ricardo");
        queue.offer("Carlos");
        queue.offer("Estela");

        // recupera el primer elemento de la lista
        System.out.println(queue.peek());

        // Elimina el primer elemento de la lista
        queue.poll();

        System.out.println(queue);
    }
}