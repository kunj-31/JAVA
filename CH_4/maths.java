package CH_4;

import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner cost_price=new Scanner(System.in);
        System.out.println("Enter the cost price:");
        int cost=cost_price.nextInt();
        System.out.println("Enter the selling price:");
        int sell=cost_price.nextInt();
        if(cost>sell){
            System.out.println("The loss is "+(cost-sell));
        }
        else{
            System.out.println("The profit is "+(sell-cost));   
    }
        cost_price.close();
}
}
