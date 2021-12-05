package com.company;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class consumer implements Runnable {

    BlockingQueue<Integer> obj;

    // Initialize taken to -1
    // to indicate that no number
    // has been taken so far.
    int taken = -1;
    int count =0;

    public consumer(BlockingQueue<Integer> obj)
    {
        // accept an ArrayBlockingQueue object from
        // constructor
        this.obj = obj;
    }

    @Override public void run()
    {

        // Take numbers from the buffer and
        // print them, if the last number taken
        // is 4 then stop
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
