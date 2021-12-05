package com.company;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class producer implements Runnable {

    BlockingQueue<Integer> obj;
    int count =0;

    public producer(BlockingQueue<Integer> obj)
    {
        this.obj = obj;
    }

    @Override public void run()
    {
        for (int i = 1; i >= 1; i++) {
            try {
                obj.put(i);
                count = obj.size();
                System.out.println("Produced " + i + "  Size: " + count);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
