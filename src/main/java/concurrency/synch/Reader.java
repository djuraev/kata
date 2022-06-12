package concurrency.synch;

public class Reader extends Thread {
    //
    private Queue queue;

    public Reader(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //
        while (true) {
            System.out.println(queue.use());
        }
    }
}
