package concurrency.basic;

public class WithThread extends Thread {
    //

    WithThread() {
        super();
    }

    @Override
    public void run() {
        //
        System.out.println("Inside WithThread:" + Thread.currentThread().getName());
    }
}
