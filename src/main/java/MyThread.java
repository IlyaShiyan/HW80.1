public class MyThread implements Runnable{

    String name;

    public MyThread(String name) {
        this.name = name;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }

    }
}
