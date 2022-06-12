package concurrency.synch;

import java.util.Random;

public class Writer extends Thread {
    //
    private Queue queue;
    Random random;

    public Writer(Queue queue) {
        this.queue = queue;
        random = new Random();
    }

    public void run() {
        //
        while (true) {
            int value = random.nextInt(1000);
            System.out.println("Produced: "+value);
            queue.put(value);
        }
    }
}
