package CH_4;

import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = number.nextInt();
        if(num%5==0 || num%3==0){
            System.out.println("The number is divisible by 5 and  3.");

        }else{
            System.out.println("The number is not divisible by 5 and 3.");
        }
        number.close();
    }
}
