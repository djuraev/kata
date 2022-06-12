package concurrency.synch;

public class Consumer extends Thread {
    //
    private Resource resource;
    private String message;

    public Consumer(Resource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    @Override
    public void run() {
        //
        try {
            resource.use(this.message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
