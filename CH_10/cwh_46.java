package CH_10;

//constructer_in_inhernitance in java
class base1 {
    public int x;

    base1() {
        System.out.println("hi and how are you!");
    }

    base1(int k) {
        System.out.println("Hello and how are you and k value is:" + k);
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }
}

class Derived1 extends base1 {
    Derived1() {
        // super keyword usefor the accsses for the base class argument constructer
        // super(45);
        System.out.println("how are and hii");
    }

    Derived1(int k, int y) {
        super(k);
        System.out.println("i am overloaded constructer with derived with the value of b as:" + y);
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class childDerived extends Derived1 {
    childDerived() {
        System.out.println("I am child of derived constructed");
    }

    childDerived(int k, int y, int z) {
        super(k, y);
        System.out.println("I am child of derived constructed with the value of x as:" + z);
    }
}

public class cwh_46 {
    public static void main(String[] args) {
        // base1 b=new base1();
        // Derived1 d = new Derived1();
        // Derived1 c=new Derived1(45,67);
        // childDerived e=new childDerived();
        // childDerived f = new childDerived(12, 13, 15);
    }
}
