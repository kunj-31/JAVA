package CH_5;
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        System.out.print("enter the n that make you print the loop:");
        Scanner number=new Scanner(System.in);
        int n=number.nextInt();
        int b=1;
       do{
         System.out.println(b);
          b++;
       }while(b<n);
       number.close();
    }
}
