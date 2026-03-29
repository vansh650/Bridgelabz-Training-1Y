package multithreading;

public class MyThread3 extends MyThread2 {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("odd" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}