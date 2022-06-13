package concurrency.deadlock;

public class TaskRunner extends Thread {
    //
    private PrimaryResource primaryResource;
    private SecondaryResource secondaryResource;

    public TaskRunner(PrimaryResource primaryResource, SecondaryResource secondaryResource) {
        //
        this.primaryResource = primaryResource;
        this.secondaryResource = secondaryResource;
    }

    @Override
    public void run() {
        //
        System.out.println("Locking primary in Task Runner...");
        synchronized (primaryResource) {
            System.out.println("Primary Locked in Task Runner !!!");
            primaryResource.increment();
            System.out.println(primaryResource.getCounter());

            System.out.println("Locking secondary in Task Runner...");
            synchronized (secondaryResource) {
                System.out.println("Secondary Locked in Task Runner !!!");
                secondaryResource.add(primaryResource.getCounter());
            }
        }
    }
}
