package concurrency.signal;

public class Demo {
    //
    public static void main(String[] args) throws InterruptedException {
        //
        BlockingResource resource = new BlockingResource(5);
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
        System.out.println("==========================");
    }
}
