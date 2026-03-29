package polymorpism;

public class Runner {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int sum1 = c1.add(11,12);
        System.out.println("sum of integers " +sum1);

        double sum2 = c1.add(111.222,222.333);
        System.out.println("sum of double " + sum2 );
    }
}
