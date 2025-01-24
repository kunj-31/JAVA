package CH_4;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=number.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        number.close();
    }
}
