package speedtest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        /* LinkedList */

        startTime = System.nanoTime();

        linkedList.get(1000000-1);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t"+elapsedTime+"ns");

        /* ArrayList */

        startTime = System.nanoTime();

        arrayList.get(1000000-1);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t"+elapsedTime+"ns");

    }
}
