package CH_4;
import java.util.Scanner;

public class absulatue {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=number.nextInt();
        if(num>0){
            System.out.println("The absolute value is "+num);
        }
        else{
            System.out.println("The absolute value is "+(-num));
        }
        number.close();
    }
}
