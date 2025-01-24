package PRCTISESET.SET_5;

import java.util.Scanner;

public class practise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        
        
        // problem 1
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n+1-i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // sc.close();



        // problem 2
        // int sum = 0;
        // int i = 0;
        // while (i < n) {
        //    sum=sum+(2*i);
        //     i++;
        // }
        // System.out.println(sum);


        // problem 3
        // for(int i=1;i<=10;i++){
        //     System.out.printf("%d X %d = %d\n",n,i,n*i);
        // }

        
        
        //problem 4
        // for(int i=10;i>=1;i--){
        //     System.out.printf("%d X %d = %d\n",n,i,n*i);
        // }


        //problem 5-6-7
        // int product=1;
        // for(int i=1;i<=n;i++){
        //     product*=i;
        // }
        // System.out.println(product);

        //problem 9
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
            sum=sum+(n*i);
        }
        System.out.println(sum);

            sc.close();
    }
}
