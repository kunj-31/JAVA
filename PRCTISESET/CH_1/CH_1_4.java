package PRCTISESET.CH_1;

import java.util.Scanner;

public class CH_1_4 {
    public static void main(String[]args){
        System.out.println("ENter the number:");
        Scanner num=new Scanner(System.in);
        System.out.println(num.hasNextInt());
        num.close();
    }
}
