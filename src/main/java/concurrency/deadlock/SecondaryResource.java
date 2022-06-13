package concurrency.deadlock;

public class SecondaryResource {
    //
    private long sum;

    public SecondaryResource() {
        //
        this.sum = 0;
    }

    public void add(int value) {
        this.sum += value;
    }

    public long getValue() {
        //
        return this.sum;
    }
}
