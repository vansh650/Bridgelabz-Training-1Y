package Inheritance;

public class Runner {
    public static void main(String[] args) {
        System.out.println("parent class ");
        Animal a = new Animal();
        a.walk();
        Dog a1 = new Dog();
        a1.sound();
        a1.walk();
        System.out.println("child class ");
        Puppy a2 = new Puppy();
        a2.look();
        a2.walk();
        a2.sound();


    }
}
