package Collections;

import java.util.*;
public class Array_Dequeue {
    public static void main(String[] args) {
          ArrayDeque<Integer>ad1=new ArrayDeque<>();
          ad1.add(6);
          ad1.add(8);
          ad1.addFirst(5);
          ad1.removeFirst();
          ad1.removeLast();
          System.out.println(ad1.getFirst());
          System.out.println(ad1.getLast());
    }
}
 