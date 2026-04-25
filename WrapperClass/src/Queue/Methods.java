package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Methods {
    public static void main(String[] args) {
        Queue<String> p1=new PriorityQueue<>();
    
        p1.add("csk");
        p1.add("shreyas");
        p1.add("gill");
        p1.add("dhoni");
        String s1= p1.element();
        System.out.println(s1);

        p1.offer("vansh");
        System.out.println(p1);
        p1.remove("vansh");
        System.out.println("offer in queue:-" +p1);

    }
}
