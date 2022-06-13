package concurrency.deadlock;

public class PrimaryResource {
    //
    private int counter;

    public PrimaryResource() {
        //
    }

    public void increment() {
        //
        this.counter++;
    }

    public int getCounter() {
        //
        return this.counter;
    }
}
