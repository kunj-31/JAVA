package PRCTISESET.CH_1;

import java.util.Scanner;

public class CH_1_3 {
    public static void main(String[]args){
        System.out.println("what is your name?");
        Scanner name=new Scanner(System.in);
        String a=name.next();
        System.out.println("hello,"+a+"!");
        name.close();
    }
}
