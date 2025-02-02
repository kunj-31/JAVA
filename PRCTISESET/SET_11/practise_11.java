package PRCTISESET.SET_11;

//problem-4
abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartPhone extends TelePhone {
    @Override
    public void ring() {
        System.out.println("TU je dekha tu jai ja na sanam!!!");
    }

    @Override
    public void lift() {
        System.out.println("lift the Phone!!!!");
    }

    @Override
    public void disconnect() {
        System.out.println("now discoonect the phone!!!!");
    }
}

// -----------------------------------------------------------------------//

// problem-3
class Monkey {
    public void jump() {
        System.out.println("Monkey jump>>>>");
    }

    public void bite() {
        System.out.println("Monkey bite!!!!!!!");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Monkey eat banana****");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey now sleep^^^^^^");
    }
}

// ----------------------------------------------------------//

// problem-1 & 2
abstract class pen {
    abstract void Write();

    abstract void refill();
}

class FountainPen extends pen {
    @Override
    public void Write() {
        System.out.println("start Writing!!!!");
    }

    @Override
    public void refill() {
        System.out.println("Fill the refill in this pen....");
    }

    public void changeNib() {
        System.out.println("Changing the name......");
    }
}

public class practise_11 {
    public static void main(String[] args) {

        // problem-1 & 2
        FountainPen write = new FountainPen();
        write.Write();
        write.refill();
        write.changeNib();

        // ------------------------------------------------//

        // problem-3
        Human manav = new Human();
        manav.jump();
        manav.bite();
        manav.eat();
        manav.sleep();

        // -----------------------------------------------//

        // problem-5
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        // m1.eat();------->not allowed

        // --------------------------------------------------//
        // problem-4
        SmartPhone Phone = new SmartPhone();
        Phone.ring();
        Phone.lift();
        Phone.disconnect();

    }
}
