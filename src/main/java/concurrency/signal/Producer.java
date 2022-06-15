package concurrency.signal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Producer extends Thread {
    //
    private BlockingResource blockingResource;

    Producer(BlockingResource blockingResource) {
        //
        this.blockingResource = blockingResource;
    }

    @Override
    public void run() {
        //
        try {
            while (true) {
                this.blockingResource.put(generateString());
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }

    private String generateString() {
        //
        byte[] array = new byte[8];
        Random random = new Random();
        random.nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }
}
