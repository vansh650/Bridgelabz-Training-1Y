package ArrayList;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
         Set<Integer> Set1 = new HashSet<>();
         Set1.add(10);
         Set1.add(20);
         Set1.add(30);
         Set1.add(null);
         Set1.add(null);
         System.out.println("Hashset:-" +Set1);

         Set<Integer> Set2 = new LinkedHashSet<>();
         Set2.add(10);
         Set2.add(20);
         Set2.add(30);
         Set2.add(null);
         Set2.add(null);
      System.out.println("LinkedHashSet:-" +Set2);

      Set<Integer> Set3 = new TreeSet<>();
      Set3.add(10);
      Set3.add(20);
      Set3.add(30);

      System.out.println("Treeset:-" +Set3);
    }
}
