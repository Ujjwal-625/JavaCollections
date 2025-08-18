package org.example.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private int value;
    BlockingQueue<Integer> q;

    public Producer( BlockingQueue<Integer> q) {
        this.value = 0;
        this.q = q;
    }

    @Override
    public void run() {
        while(true){
            try {
                q.put(value++);
                System.out.println("Value added to queue");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    BlockingQueue<Integer> q;

    public Consumer( BlockingQueue<Integer> q) {
        this.q = q;
    }

    @Override
    public void run() {
        while(true){
            try {
                int value=q.take();
                System.out.println("Value taken from the queue");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer>q=new ArrayBlockingQueue<>(5);
        Thread producer=new Thread(new Producer(q));
        Thread consumer=new Thread(new Consumer(q));

        producer.start();
        consumer.start();
    }
}
