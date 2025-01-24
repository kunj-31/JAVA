package CH_4;

import java.util.Scanner;

public class gretest {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = number.nextInt();
        System.out.print("Enter second number: ");
        int num2 = number.nextInt();
        System.out.print("Enter third number: ");
        int num3 = number.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("The gretest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The gretest number is " + num2);
        } else {
            System.out.println("The gretest number is " + num3);
        }
        number.close();
    }
}
