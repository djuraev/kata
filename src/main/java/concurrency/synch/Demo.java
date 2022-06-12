package concurrency.synch;

import java.util.List;

public class Demo {
    //
    public static void main(String[] args) throws InterruptedException {
        //
        Queue queue = new Queue();

        Writer writer = new Writer(queue);
        Reader reader = new Reader(queue);

        writer.start();
        reader.start();

        writer.join();
        reader.join();
    }
}
