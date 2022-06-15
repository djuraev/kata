package concurrency.signal;


import dstructure.stack.ListStack;

public class BlockingResource {
    //
    private ListStack<String> stack;
    private int capacity;

    public BlockingResource(int capacity){
        //
        this.capacity = capacity;
        stack = new ListStack<>();
    }

    public synchronized void put(String value) throws InterruptedException {
        //
        while (stack.size() == capacity) {
            wait();
        }
        System.out.println("Putting value: "+value);
        stack.push(value);
        notify();
    }

    public synchronized String consume() throws InterruptedException {
        //
        while (stack.isEmpty()) {
            wait();
        }
        String value = stack.peek();
        System.out.println("Consuming value: "+value);
        notify();
        return value;
    }
}
