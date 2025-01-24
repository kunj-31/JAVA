package CH_4;
import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = number.nextInt();
        if(num>99 && num<1000){
            System.out.println("The number is three digit number.");
        }else{
            System.out.println("The number is not three digit number.");
        }
        number.close();
    }
}
