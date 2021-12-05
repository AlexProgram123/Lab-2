package com.company;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class consumer implements Runnable {

    BlockingQueue<Integer> obj;

    int taken = -1;
    int count =0;

    public consumer(BlockingQueue<Integer> obj)
    {
        this.obj = obj;
    }

    @Override public void run()
    {

        for (int i = 1; i >= 1; i++) {
            try {
                taken = obj.take();
                count = obj.size();
                System.out.println("Consumed " + taken + "  Size: " + count);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
