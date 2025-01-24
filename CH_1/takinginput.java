
import java.util.Scanner;

public class takinginput {
   public static void main(String[] args) {
       System.out.println("Taking input from the user:");
       Scanner kunj = new Scanner(System.in);
           System.out.println("Enter number 1:");
           int a = kunj.nextInt();
           System.out.println("Enter number 2:");
           int b = kunj.nextInt();
           int sum = a + b;
           System.out.println("The sum of these numbers is:");
           System.out.println(sum);
       
           kunj.close();
       
   }
}
