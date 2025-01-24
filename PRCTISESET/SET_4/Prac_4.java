package PRCTISESET.SET_4;

import java.util.Scanner;

// import java.util.Scanner;

public class Prac_4 {
    public static void main(String[] args) {
        // problem-1
        // int a=10;
        // if(a=11){
        // System.out.println("I am 11");
        // }
        // else{
        // System.out.println("I am not 11");
        // }

        // problem-2
        // Scanner marks=new Scanner(System.in);
        // System.out.println("Enter your first subject marks:");
        // int sub1=marks.nextInt();
        // System.out.println("Enter your second subject marks:");
        // int sub2=marks.nextInt();
        // System.out.println("Enter your third subject marks:");
        // int sub3=marks.nextInt();
        // float avg=(sub1+sub2+sub3)/3.0f;
        // if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33){
        // System.out.println("You are pass");
        // }
        // else{
        // System.out.println("You are fail");
        // }
        // System.out.println("Your percentage is:"+avg);
        // marks.close();

        // problem-3
        // float TAX=0;
        // float Income=5.0f;
        // if(Income<=2.5){
        // TAX=TAX+0;
        // }
        // else if(Income>2.5f && Income<=5.0f){
        // TAX=TAX+0.05f*(Income-2.5f);
        // }
        // else if(Income>5.0f && Income<=10.0f){
        // TAX=TAX+0.05f*(5.0f-2.5f);
        // TAX=TAX+0.2f*(Income-5f);
        // }
        // else{
        // TAX=TAX+0.05f*(5.0f-2.5f);
        // TAX=TAX+0.2f*(10.0f-5f);
        // TAX=TAX+0.3f*(Income-10.0f);
        // }

        // System.out.println("The total tax paid by the employee is:"+TAX);

        // problem-4
        // Scanner DAY=new Scanner(System.in);
        // System.out.println("Enter your day number:");
        // int day=DAY.nextInt();
        // switch(day){
        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesday");
        //     break;
        //     case 3:
        //     System.out.println("Wednesday");
        //     break;
        //     case 4:
        //     System.out.println("Thursday");
        //     break;
        //     case 5:
        //     System.out.println("Friday");
        //     break;
        //     case 6:
        //     System.out.println("Saturday");
        //     break;
        //     case 7:
        //     System.out.println("Sunday");
        //     break;
        //     default:
        //     System.out.println("Invalid day");
        // }

        // problem-5
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your website name:");
        String website=sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an organisational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }
        sc.close();
    }
}
