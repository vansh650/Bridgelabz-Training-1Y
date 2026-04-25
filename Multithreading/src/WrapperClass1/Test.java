package WrapperClass1;
import java.util.ArrayList;
import java.util.List;
public class Test {

            public static void main(String[] args) {
                List<Integer> l1 = new ArrayList<>();
                l1.add(10);
                l1.add(20);
                l1.add(30);
                l1.add(40);
                l1.add(50);
                l1.add(60);

                System.out.println(l1);


                boolean e = l1.contains(10);
                System.out.println(e);

                boolean b = l1.isEmpty();
                System.out.println(b);
                int index1 = l1.get(4);
                System.out.println(index1);
                System.out.println(l1.contains(20));
            }
        }


