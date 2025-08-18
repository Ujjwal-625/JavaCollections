package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        System.out.println(q.poll());//returns null
       // System.out.println(q.remove());//raise exception

        System.out.println(q.peek());//returns null
        //System.out.println(q.element());//throws Exception

        q.add(10);
        q.offer(20);

        System.out.println(q.peek());
        System.out.println(q.element());

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.poll());


        Queue<Integer> q1=new ArrayBlockingQueue<>(2);//fixed sized queue
        q1.add(1);
        q1.offer(2);//returns true if element is added else false is returned
//        q1.add(3); throws exception as queue is full
        q1.offer(3);//nothing will be added in queue as it is full



    }
}
