package multithreading;

public class A extends Thread {
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("vansh");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
