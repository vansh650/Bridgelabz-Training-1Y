package exceptionhandling;

public class HandlingPractice {
    static void agechecker(int age) throws ArithmeticException,NullPointerException{
    if(age<18)
        throw new ArithmeticException("Invalid age");
    }

    public static void main(String[] args) {
        try{
            agechecker(18);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
