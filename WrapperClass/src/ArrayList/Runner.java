package ArrayList;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(101,"vansh" , 98.2));
        student.add(new Student(101,"harshit", 96.42));
        student.add(new Student(101,"rohit", 88.2));
        student.add(new Student(101,"mohit", 67.2));
        for(Student data:student){
            System.out.println(data);
        }


    }
}
