package LmabdaExpression2;

public class Demo {
    public static void main(String[] args) {
        Runnable r1 = () ->{
            System.out.println("this is my first thread");
        };
        Runnable r2 = () ->{
            System.out.println("this is my second  thread");
        };
        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();
        Runnable r3 = () ->{
            for(int i=1;i<10;i++){
                System.out.println("this is my thrid thread");
                try {
                    Thread.sleep(2000);
                }
                catch {
                    `   
                }
            }
        };
    }
}
