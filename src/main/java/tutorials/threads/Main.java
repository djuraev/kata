package tutorials.threads;

import java.util.stream.IntStream;

public class Main {
    //
    public static void main(String[] args) {
        //
        RaceCondition rc1 = new RaceCondition();
        RaceCondition rc2 = new RaceCondition();

        IntStream.range(0, 1000000).forEach(index -> rc1.increment());
        IntStream.range(0, 1000000).parallel().forEach(index -> rc2.increment());

        System.out.printf("%d, %d%n", rc1.counter, rc2.counter);
    }
}
