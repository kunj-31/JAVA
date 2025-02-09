package Collections;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        //janaricse
        ArrayList<Integer>l1=new ArrayList<>();  
        ArrayList<Integer>l2=new ArrayList<>(9);
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(2,l2);
        System.out.println(l1.contains(15));
        System.out.println(l1.indexOf(159));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.remove(2));
        System.out.println(l1.add(56));
        l1.add(2,67);
        System.out.println(l1.remove(2));
        l1.set(1,89);
        System.out.println(l1.isEmpty());
        System.out.println(l1.subList(1,4));
        System.out.println(l1.retainAll(l2));
       
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
