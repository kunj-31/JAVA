package CH_4;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=number.nextInt();
        if(num%5==0){
            System.out.println("The number is divisible by 5");
        }
        else{
            System.out.println("The number is not divisible by 5");
        }
        number.close();
    }
}
