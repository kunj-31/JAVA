package PRCTISESET.CH_1;
import java.util.Scanner;

public class CH_1_1 {
    public static void main(String[]args){
       System.out.println(" give me three numbers:"); 
       Scanner a1=new Scanner(System.in);
       int a=a1.nextInt();
       int b=a1.nextInt();
       int c=a1.nextInt();
       int sum=a+b+c;
       System.out.println("the sum of three numbers is:"+sum);
       a1.close();

    }
}
