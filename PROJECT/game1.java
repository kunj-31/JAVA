
//Rock Paper Scissor Game and show what the computer choose
import java.util.Scanner;

public class  game1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissor Game");
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
        Scanner sc = new Scanner(System.in);
        // User Input
        int userInput = sc.nextInt();
        if (userInput == 0) {
            System.out.println("You Choose: Rock");
        } else if (userInput == 1) {
            System.out.println("You Choose: Paper");
        } else if (userInput == 2) {
            System.out.println("You Choose: Scissor");
        } else {
            System.out.println("Invalid Input");
        }

        // Computer Input
        int computerInput = (int) (Math.random() * 3);
        if (computerInput == 0) {
            System.out.println("Computer Choice: Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer Choice: Paper");
        } else if (computerInput == 2) {
            System.out.println("Computer Choice: Scissor");
        }

        // Result
        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win");
        } else {
            System.out.println("Computer Win");
        }
        sc.close();
    }
}