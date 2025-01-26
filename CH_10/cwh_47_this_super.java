package CH_10;

class Ekclass {
    public int a;

    public int getA() {
        return a;
    }

    Ekclass(int v) {
        this.a = v;
    }

    public int returnone() {
        return 1;
    }
}

class Doclass extends Ekclass {
    Doclass(int c) {
        super(c);
        System.out.println("MAI EK COnstructer Hoon");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(65);
        System.out.println(e.getA());
        Doclass d = new Doclass(5);
        d.getA();
    }
}
