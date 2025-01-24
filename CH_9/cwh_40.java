package CH_9;

class Myemployee {
    private int id;
    private String name;

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

}

public class cwh_40 {
    public static void main(String[] args) {
        Myemployee Kunj = new Myemployee();
        // Kunj.id = 234;
        // Kunj.name = "kunj Desai";
        Kunj.setname("Kunj DESAI");
        System.out.println(Kunj.getname());
        Kunj.setId(34);
        System.out.println(Kunj.getId());

    }
}
