package CH_4;
import java.util.Scanner;

public class condi_1 {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.println("Enter your age");
        int AGE=age.nextInt();
        if(AGE>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
    }
        age.close();
}
}