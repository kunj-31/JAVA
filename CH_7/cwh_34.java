package CH_7;

public class cwh_34 {
    // static int factorial(int n) {
    // if (n == 0 || n == 1) {
    // return 1;
    // } else {
    // return n * factorial(n + 1);
    // }
    // }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int x = 8;
        // System.out.println("the value of the factorial is:" + factorial(x));
        System.out.println("the term of the fibonaci squence is:" + fib(x));
    }
}
