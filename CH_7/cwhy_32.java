package CH_7;

//method-overloading
public class cwhy_32 {
    static void food() {
        System.out.println("idli");
    }

    static void food(int a) {
        System.out.println("dosa " + a + " vada");
    }

    static void food(int b, int c) {// parameteres
        System.out.println("nasta " + b + " our chai");
    }

    static void tellmeyourname() {
        System.out.println("------VEDDESAI--------");
    }

    static void change(int[] arr) {
        arr[0] = 78;
    }

    public static void main(String[] args) {
        tellmeyourname();
        int marks[] = { 56, 85, 88, 89, 78, 123 };
        change(marks);
        System.out.println("the value after the change is arr[0]:" + marks[0]);

        // methodoverloading
        food();
        food(5);
        food(6, 7);
        // actual arguments
    }

}
