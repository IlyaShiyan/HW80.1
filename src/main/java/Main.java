import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);

        es.execute(new MyThread("A"));
        es.execute(new MyThread("B"));
        es.execute(new MyThread("C"));

        es.shutdown();
    }
}
