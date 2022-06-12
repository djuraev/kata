package concurrency.basic;

public class ThreadDemo {
    //

    public static void main(String[] args) throws InterruptedException {
        //

        Thread wth = new WithThread();
        Runnable runnable = new WithRunnable();
        Thread thread = new Thread(runnable);

        thread.start();
        wth.start();

        wth.join();
        thread.join();

    }
}
