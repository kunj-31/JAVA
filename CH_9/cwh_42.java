package CH_9;

class MyMainemployee {
    private int id;
    private String name;

    // private int salary;
    // constructed in method overl loading
    public MyMainemployee(String NAME, int ID, int Salary) {
        id = ID;
        name = NAME;
        // salary=Salary;
    }

    public MyMainemployee() {
        id = 12;
        name = "kunjdesai";
    }

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

public class cwh_42 {
    public static void main(String[] args) {
        MyMainemployee Kunj = new MyMainemployee();
        // Kunj.setname("MASTRAHO");
        // Kunj.setId(456);
        System.out.println(Kunj.getname());
        System.out.println(Kunj.getId());
    }
}