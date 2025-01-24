package CH_5;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner odd = new Scanner(System.in);
        int n = odd.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }

        Scanner reverse = new Scanner(System.in);
        int number = reverse.nextInt();
        for (int j = number; j >= 0; j--) {
            System.out.println(j);
        }
        odd.close();
        reverse.close();

    }
}
