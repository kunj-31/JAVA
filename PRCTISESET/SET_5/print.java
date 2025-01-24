package PRCTISESET.SET_5;

import java.util.Scanner;

//print this pattern
//* * * * * * * 
//* * *   * * *
//* *       * *
//*           *
public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int min = 0;
            for (int i = 1; i < 2 * n - 1; i++) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    int a = i;
                    if (i > n) a = 2 * n - i;
                    int b = j;
                    if (b > n) b = 2 * n - j;
                    if (a < b) min = a;
                    else min = b;
                    System.out.print(n + 1 - min);
                }
                System.out.println();
            }
        } finally {
            sc.close();
        }
    }
}