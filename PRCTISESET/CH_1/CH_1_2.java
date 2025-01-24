package PRCTISESET.CH_1;

import java.util.Scanner;

public class CH_1_2 {
    public static void main(String[]args){
        System.out.println("enter the three subject marks:");
        Scanner sub1=new Scanner(System.in);
        float a=sub1.nextInt();
        float b=sub1.nextInt();
        float c=sub1.nextInt();
        float sum=(a+b+c)/30;
        System.out.println("the CGP is:"+sum);
        sub1.close();
    }
}
