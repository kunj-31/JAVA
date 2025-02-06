package CH_14;

public class try_catch {
    public static void main(String[] args) {
        int a=70000;
        int b=0;
        try{
        int c=a/b;
        System.out.println("the result is:"+c);
        }
        catch(Exception e){
            System.out.println("we failed to divide,Reson:");
            System.out.println(e);
        }
        System.out.println("end of the program!!!");
       
    }
}
