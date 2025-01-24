package CH_7;

public class cwh_33 {
    // static int sum(int a, int b) {
    //     return a + b;
    // }
    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    static int sum(int x,int ...arr){
        //available as int []arr;
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO VARAGS TUtorial");
        System.out.println("the sum is:"+sum(1));
        System.out.println("the sum of 4 and 5 is:"+sum(4,5));
        System.out.println("the sum of 4,3,7 is:"+sum(4,3,7));
        System.out.println("the sum of the 5,7,8,9 is:"+sum(5,7,8,9));
    }
}
