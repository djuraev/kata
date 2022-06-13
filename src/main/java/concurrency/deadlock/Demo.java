package concurrency.deadlock;

public class Demo {
    //

    public static void main(String[] args) throws InterruptedException {
        //
        PrimaryResource primaryResource = new PrimaryResource();
        SecondaryResource secondaryResource = new SecondaryResource();

        TaskRunner taskRunner = new TaskRunner(primaryResource, secondaryResource);
        Runnable taskWatcherRunnable = new TaskWatcher(primaryResource, secondaryResource);
        Thread taskWatcher = new Thread(taskWatcherRunnable);

        taskRunner.start();
        taskWatcher.start();

        taskRunner.join();
        taskWatcher.join();
        System.out.println("....THE END....");
    }
}
