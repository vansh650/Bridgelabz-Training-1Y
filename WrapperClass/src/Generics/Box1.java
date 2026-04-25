package Generics;

import java.util.ArrayList;

public class Box1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("vansh");
        list.add(111.222);
        list.add('A');
        System.out.println(list);

        int index0=(int)list.get(0);
        System.out.println("Index 0 :- "+index0);

        String index1=(String)list.get(1);
        System.out.println("Index 1:-"+index1);

        double index2=(double)list.get(2);
        System.out.println("Index 2:-"+index2);
    }
}
