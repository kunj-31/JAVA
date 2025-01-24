package CH_4;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner  year=new Scanner(System.in);
        System.out.println("Enter the year:");
        int YEAR=year.nextInt();
        if(YEAR%400==0 || YEAR%100!=0 ){
            System.out.println("The year is leap year");
        }
        else{
            System.out.println("The year is not leap year");
        }
        year.close();
    }
}
