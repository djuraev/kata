package concurrency.deadlock;

public class TaskWatcher implements Runnable {
    //
    private PrimaryResource primaryResource;
    private SecondaryResource secondaryResource;

    public TaskWatcher(PrimaryResource primaryResource, SecondaryResource secondaryResource) {
        //
        this.primaryResource = primaryResource;
        this.secondaryResource = secondaryResource;
    }

    @Override
    public void run() {
        System.out.println("Locking secondary resource in TaskWatcher...");
        synchronized (secondaryResource) {
            System.out.println("Locked secondary resource in TaskWatcher...");
            secondaryResource.add(1);

            System.out.println("Locking primary resource in TaskWatcher...");
            synchronized (primaryResource) {
                System.out.println("Locked primary resource in TaskWatcher...");

                primaryResource.increment();
                secondaryResource.add(primaryResource.getCounter());
            }
        }
    }
}
