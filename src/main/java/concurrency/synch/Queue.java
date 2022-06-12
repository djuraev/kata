package concurrency.synch;

public class Queue {
    //
    private int[] container;
    private int index;

    public Queue() {
        //
        container = new int[10];
        index = 0;
    }

    public synchronized void put(int value) {
        if (index >= container.length) {
            System.out.println("Queue overflow.");
            return;
        }
        container[index++] = value;
    }

    public synchronized int use() {
        //
        if (index < 0) {
            System.out.println("Queue underflow.");
            return Integer.MIN_VALUE;
        }
        return container[index--];
    }
}
