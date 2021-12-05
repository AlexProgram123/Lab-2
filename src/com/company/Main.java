package com.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Create a Main class for execution
public class Main {
    public static void main(String[] args)
    {
        BlockingQueue<Integer> bqueue
                = new ArrayBlockingQueue<Integer>(100);

        producer p1 = new producer(bqueue);
        consumer c1 = new consumer(bqueue);

        Thread pThread = new Thread(p1);
        Thread cThread = new Thread(c1);

        pThread.start();
        cThread.start();
    }
}
