package exceptionhandling;
    class InvalidAgeCheckerException extends Exception {
        public InvalidAgeCheckerException(String msg) {
            super(msg);
        }
    }
public class CustomException{
    static void agechecker(int age) throws InvalidAgeCheckerException {
        if (age < 18) {
            throw new InvalidAgeCheckerException("Age is invalid for voting ");
        }
        System.out.print("age is valid for voting ");
    }

    public static void main(String[] args) {
        try {
            agechecker(18);
        } catch (InvalidAgeCheckerException e){
            System.out.println(e);
        }
    }
}