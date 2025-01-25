package CH_10;

//superclass/perentclass/baseclass
class base {
    public int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("hii and how are you");
        this.x = x;
    }

    public void printMe() {
        System.out.println("hello and weclome agian and chai pio  or mast raho");
    }

}

//derivedclass/childclass/subclass
class Derived extends base {
    public int y;
    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

}

public class cwh_45 {
    public static void main(String[] args) {
        base b=new base();
        b.setx((4));
        System.out.println("the number is:"+b.getx());
        Derived d=new Derived();
        d.setx((14));
        System.out.println("the number is:"+d.getx());
        Derived c=new Derived();
        c.sety((44));
        System.out.println("the number is:"+c.gety());

    }
}
