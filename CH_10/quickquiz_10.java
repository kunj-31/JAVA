package CH_10;

//superclass
class animal {
    public String bark = "BARK";
    public int eyes;
    public String colour = "BROWN";

    public void dogsound() {
        System.out.println("bhaaavbhaaav........!");
    }

    public void dogbark() {
        System.out.println("the dogs barks you:" + bark);
    }

    public void dogclour() {
        System.out.println("the dogs colour is:" + colour);
    }

    public int geteyes() {
        return eyes;
    }

    public void seteyes(int eyes) {
        this.eyes = eyes;
    }
}

// subclass
class fatch extends animal {
    public int eyes1;

    public int geteyes1() {
        return eyes1;
    }

    public void seteyes1(int eyes1) {
        this.eyes1 = eyes1;
    }
}

public class quickquiz_10 {
    public static void main(String[] args) {
        fatch f = new fatch();
        f.dogclour();
        f.dogbark();
        f.dogsound();
        f.seteyes(2);
        System.out.println("the dog eyes is:" + f.geteyes());
    }
}
