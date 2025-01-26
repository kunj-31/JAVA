package CH_10;

//dynamic_method_dispatch

class Phone {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void on() {
        System.out.println("turning on the phone....");
    }
}

class smartPhone extends Phone {
    public void swagat() {
        System.out.println("Apka Swagat hai");
    }

    @Override
    public void on() {
        System.out.println("turninng on the smartPhone.....");
    }
}

public class cwh_49 {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // smartPhone sobj=new smartPhone();
        // obj.name();

        Phone obj = new smartPhone();
        obj.greet();
        obj.on();
       // obj.swagat();
    }
}
