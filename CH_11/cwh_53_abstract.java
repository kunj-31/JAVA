
//abstract class consept
abstract class Base2{

    public Base2(){
        System.out.println("i am constructer of the Base2 class ");
    }
    public void saygoodnight(){
        System.out.println("Good Night!!!!");
    }

    abstract public void greet();
    abstract public void greet1();

}

//concret class 
class Child extends Base2{
    @Override
    public void greet(){
        System.out.println("Good morning!!!!!");
    }
    public void greet1(){
        System.out.println("good bye!!!");
    }
}


abstract class Child2 extends Base2{
    public void th(){
        System.out.println("I am Good");
    }

}

public class cwh_53_abstract{
    public static void main(String[] args) {
        //Base2 p=new Base2();   ----errror----
        //Child2 d=new Child2();|


        //write
        //Child c=new Child();

    }
}
