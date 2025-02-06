package CH_14;

import java.util.Scanner;

public class nested_tryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 68;
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to ahemdabad!!!");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception a){
            System.out.println("Exception in level-1");
        }
        sc.close();
    }
}
