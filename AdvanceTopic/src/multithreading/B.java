package multithreading;

public class B extends Thread {
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("saini");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
