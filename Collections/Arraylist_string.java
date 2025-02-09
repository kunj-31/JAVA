package Collections;
import java.util.*;
public class Arraylist_string {
    public static void main(String[] args) {
        ArrayList<String>s1=new ArrayList<>();
        //create the new object
        ArrayList<String>s2=new ArrayList<>();
        //add the elements in this array
        
        s1.add("Kunj");
        s1.add("Mom");
        s1.add("father");
        s1.add("ved");
        s1.add("ustav");
        //add the element if you want to enter in the array with choice of position
        s1.add(4,"VED");

        //add the new object element in the array_list
        s2.add("Vansh");
        s2.add("preet");
        s2.add("krish");
        s1.addAll(3,s2);

        //remove the element in this array_of the index
        System.out.println(s1.remove(3));

        //Returns true if this list contains the specified element.
        System.out.println(s1.contains("Kunj"));


        //specify the element of the index from the starting 
        System.out.println(s1.indexOf("ved"));

        //specify the element of the index from the lastindex
        System.out.println(s1.lastIndexOf("krish"));

        //set the element which is all ready peresent in this array you will replace the array of element
        System.out.println(s1.set(5, "KIRANBHAI"));

        //you creat the subarray in from the array_list
        System.out.println(s1.subList(2,5));

        //Retains only the elements in this collection that are contained in the specified collection (optional operation).
        System.out.println(s1.retainAll(s2));

        //check if the array-list empty or not?
        System.out.println(s1.isEmpty());


        //clear the array_list
        s2.clear();


        //print the array-list
        for(int i=0;i<s1.size();i++){
            System.out.println(s1.get(i));
        }

    }
}
