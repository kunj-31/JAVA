package CH_7;
//methods in java

public class cwh_31 {
    static int sumproduct(int e, int d) {
        int c;
        if (e > d) {
            c = (e + d);
        } else {
            c = (e * d);
        }
        return c;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int f;
        f = sumproduct(a, b);
        // Method invocation using the Object creation
        // cwh_31 obj=new cwh_31();
        // f=obj.sumproduct(a,b);
        System.out.println(f);
        int c1 = 2;
        int c2 = 4;
        // cwh_31 obj1=new cwh_31();
        // int c3 = obj1.sumproduct(c1, c2);
        int c3=sumproduct(c1, c2);
        System.out.println(c3);
    }
}
