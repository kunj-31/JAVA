package CH_14;

import java.util.Scanner;

class MyExpection extends Exception{
    @Override
    public String toString(){
        return super.toString()+"I am toString()";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+" I am getMessage()";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
            //throw new MyExpection();
            //throw new ArithmeticException("This is an exception");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        sc.close();
    }
    
}
}
