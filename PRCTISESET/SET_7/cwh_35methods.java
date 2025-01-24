package PRCTISESET.SET_7;

import java.util.Scanner;

public class cwh_35methods {
    // problem-1
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
        }

    }

    // problem-2
    static void pattern(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // problem-3
    static int main(int n) {
        if (n == 1) {
            return 1;
        }
        int x = n + main(n - 1);
        return x;
    }

    // problem-4
    static void pattern1(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // problem-5
    static int sum(int... arr) {
        // available as int []arr;
        int result = 0;

        for (int a : arr) {
            result += a;
        }
        result = result / arr.length;
        return result;
    }

    // problem-6
    static void pattern2(int n) {
        if (n > 0) {
            pattern2(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // problem-7
    static void pattern3(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern3(n - 1);
        }
    }

    // problem-8
    static void converter(float cel) {
        float fer = (cel * 9 / 5) + 32;
        System.out.println("the cel into the fer:" + fer);
    }

    public static void main(String[] args) {
        // System.out.println("eneter thee number of the table that you want to
        // print:");
        System.out.print("enter the number of the rows:");
        // System.out.print("enter the natural number:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        // int c = sc.
        System.out.println("the sum of the 5,7,8,9 is:" + sum(10, 20, 30, 40, 50));
        pattern3(n);
        // table(n);
        System.out.print("enter the temprature in cel:");
        float temp = sc.nextFloat();
        converter(temp);

        // sc.close();
    }
}
