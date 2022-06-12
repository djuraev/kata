package concurrency.basic;

public class WithRunnable implements Runnable {
    //

    @Override
    public void run() {
        System.out.println("Inside WithRunnable: " + Thread.currentThread().getName());
    }
}
