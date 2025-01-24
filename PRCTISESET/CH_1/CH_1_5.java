package PRCTISESET.CH_1;

import java.util.Scanner;

public class CH_1_5 {
    public static void main(String[]args){
        System.out.println("enter the distance in km:");
        Scanner km=new Scanner(System.in);
        float km1=km.nextFloat();
        float miles=km1*0.621371192237334f;
        System.out.println("the distance in miles is:"+miles);
        km.close();
    }
}
