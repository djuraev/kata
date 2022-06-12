package concurrency.synch;

public class Resource {

    public void use (String message) throws InterruptedException {
        //
        System.out.println(Thread.currentThread().getName() + " started task.");
        try
        {
            System.out.print ("["+message);
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("]");
        System.out.println(Thread.currentThread().getName() + " finished task.");
    }
}
