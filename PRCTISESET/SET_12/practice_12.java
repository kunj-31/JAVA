package PRCTISESET.SET_12;

class calculatar{
    public void calculate(int a,int b){
        System.out.println("your result is:"+ a+b);
    }
}

class Sccalculater{
    public void calculatar(int a,int b){
        System.out.println("your result is:"+Math.sin(a+b));
    }
}

class Hycalculater{
    public void calculatar(int a,int b){
        System.out.println("your result is:"+Math.cos(a+b));
        System.out.println("now good bye!!!!");
    }
}
public class practice_12 {
    //problem-1
    public static void main(String[] args) {
        calculatar c=new calculatar();
        c.calculate(15,20);
    }
}
