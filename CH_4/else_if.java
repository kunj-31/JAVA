package CH_4;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner Age = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = Age.nextInt();
        if (age > 18) {
            System.out.println("You are an adult");
        } else if (age > 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("YOU ARE A KID");
    }
        Age.close();
}
}
