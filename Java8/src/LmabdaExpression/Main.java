package LmabdaExpression;

public class Main {
    public static void main(String[] args) {
        Maths add =(a,b) -> a+b;
        System.out.println(add.calc(10,20));
        Maths sub =(a,b) -> a-b;
        System.out.println(sub.calc(10,20));
        Maths mul =(a,b) -> a*b;
        System.out.println(mul.calc(10,20));
        Maths div =(a,b) -> b/a;
        System.out.println(div.calc(10,20));
    }
}
