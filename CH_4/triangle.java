package CH_4;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sides = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int side1 = sides.nextInt();
        System.out.print("Enter second side: ");
        int side2 = sides.nextInt();
        System.out.print("Enter third side:");
        int side3 = sides.nextInt();
        if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2){
            System.out.println("The triangle is valid.");
        }else{
            System.out.println("The triangle is not valid.");
        }
        sides.close();
    }
}
