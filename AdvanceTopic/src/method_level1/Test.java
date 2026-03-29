package method_level1;

public class Test {
    public static void arithmeticException() {
        try{
            int a = 10;
            int b = 0;

        double result = a / b;
        System.out.println(result);
    } catch (Exception e) {
            System.out.println(e);
        }
        }
        public static void main(String[] args){
    arithmeticException();}
}