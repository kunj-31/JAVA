package CH_8;

class Employee {
    int id;
    String name;
    int Salary;

    public void printDetails() {
        System.out.println("My id is:" + id);
        System.out.println("and my name is:" + name);
    }

    public int getSalary() {
        return Salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee Kunj = new Employee();// Instantaing a new Empolyee object
        Employee ved = new Employee();

        // setting Attributes
        Kunj.id = 18;
        Kunj.name = "KUNJ  DESAI";
        Kunj.Salary = 150000;
        ved.id = 12;
        ved.name = "VED DESAI";
        ved.Salary = 100000;

        Kunj.printDetails();
        ved.printDetails();
        int Salary = Kunj.getSalary();
        System.out.println(Salary);

        // System.out.println(Kunj.id);
        // System.out.println(Kunj.name);
    }
}
