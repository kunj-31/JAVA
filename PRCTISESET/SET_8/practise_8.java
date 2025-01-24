package PRCTISESET.SET_8;

class Employee {
    int Salary;
    String name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class cellphone {
    public void ringing() {
        System.out.println("ringing.............");
    }

    public void vibrating() {
        System.out.println("vibrating.....");
    }
}

class square {
    int side;

    public int area() {
        return side * side;
    }

    public int parameter() {
        return 4 * side;
    }

}

class rectangle {
    int side;
    int breath;

    public int area() {
        return side * breath;
    }

    public int parameter() {
        return 2 * (side + breath);
    }

}

class tommy {
    public void hit() {
        System.out.println("hitting the enemey");
    }

    public void run() {
        System.out.println("running from thr enemy");
    }

    public void fire() {
        System.out.println("firing on the enemy");
    }
}

class circle {
    float red;

    public float area() {
        float x = (float) (3.14 * (red * red));
        return x;
    }

    public float parameter() {
        float y = (float) (2 * 3.14 * red);
        return y;
    }
}

public class practise_8 {
    public static void main(String[] args) {
        Employee Kunj = new Employee();
        Kunj.Salary = 50000;
        System.out.println(Kunj.getSalary());
        Kunj.setName("Kunj DESAI");
        System.out.println(Kunj.getName());

        cellphone apple = new cellphone();
        apple.ringing();
        apple.vibrating();
        square maths = new square();
        maths.side = 7;

        System.out.println(maths.area());
        System.out.println(maths.parameter());

        rectangle rc = new rectangle();
        rc.side = 8;
        rc.breath = 10;
        System.out.println(rc.area());
        System.out.println(rc.parameter());

        tommy player1 = new tommy();
        player1.fire();
        player1.run();
        player1.hit();

        circle c = new circle();
        c.red = 8;
        System.out.println(c.area());
        System.out.println(c.parameter());
    }
}
