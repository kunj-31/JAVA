package CH_4;

import java.util.Scanner;

 //inhased switch case
public class Switch {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age1 = age.nextInt();

        switch (age1) {
            case 18 ->
                System.out.println("You are an adult");
            case 23 ->
                System.out.println("You are to apply to job");
            case 60 ->
                System.out.println("You are to retire");
            default -> {
                System.out.println("Enter a valid age");
                age.close();
            }
        }
    }
}
