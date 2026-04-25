package Java8_Features;

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo() {
            @Override
            public void info() {
                System.out.println(" Hello this is my first class");
            }
        };
        d1.info();
        Demo d2 = new Demo() {
            @Override
            public void info() {
                System.out.println(" Hello this is my second class");
            }
        };
        d2.info();
        Demo d3 = new Demo() {
            @Override
            public void info() {
                System.out.println(" Hello this is my third class");
            }
        };
        d3.info();
    }
}
