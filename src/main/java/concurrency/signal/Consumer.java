package concurrency.signal;

public class Consumer extends Thread {
    //
    private BlockingResource blockingResource;

    public Consumer(BlockingResource resource) {
        //
        this.blockingResource = resource;
    }

    @Override
    public void run() {
        //
        try {
            while (true) {
                String value = blockingResource.consume();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
