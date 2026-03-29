package Inheritance;

public class Teacher {
    String name;
    String sub;
    int id;
    public void printinfo(){
        System.out.println("name of teacher " +name);
        System.out.println("subject " +sub);
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name="vansh";
        t1.sub="javaprogramming";
        t1.printinfo();

    }

}
