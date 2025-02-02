//inheritanse in interface
interface SampleInterface{
    void math1();
    void math2();
}
interface childInterface extends SampleInterface{
    void math3();
    void math4();
}

class MySampleClass implements childInterface{
    public void math1(){
        System.out.println("I am math1");
    }
    public void math2(){
        System.out.println("I am math2");
    }
    public void math3(){
        System.out.println("I am math3");
    }
    public void math4(){
        System.out.println("I am math4");
    }
}

public class cwh_58 {
    public static void main(String[] args) {
        MySampleClass Class=new MySampleClass();
        Class.math1();
        Class.math2();
        Class.math3();
        Class.math4();

    }
}
