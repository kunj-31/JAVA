package PRCTISESET.SET_9;

class Cylinder {
    public int redius;
    public int height;

    public Cylinder(int redius, int height) {
        this.redius = redius;
        this.height = height;
    }

    public int getredius() {
        return redius;
    }

    public void setredius(int redius) {
        this.redius = redius;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public int getheight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * redius * redius + 2 * Math.PI * redius * height;
    }

    public double volumeofarea() {
        return Math.PI * redius * redius * height;
    }
}

class Rectangle {
    private int lenght;
    private int breath;

    public Rectangle() {
        this.lenght = 4;
        this.breath = 5;
    }

    public Rectangle(int lenght, int breath) {
        this.lenght = lenght;
        this.breath = breath;
    }

    public int getlength() {
        return lenght;
    }

    public void setlenght(int lenght) {
        this.lenght = lenght;
    }

    public int getbreath() {
        return breath;
    }

    public void setbreath(int breath) {
        this.breath = breath;
    }

}

public class practise_9 {
    public static void main(String[] args) {
        // Cylinder a = new Cylinder(12,9);
        // problem-1
        // a.setheight(12);
        // System.out.println("the hight of the Cylinder is:" + a.getheight());
        // a.setredius(9);
        // System.out.println("the redius of the Cylinder is:" + a.getredius());

        // //problem-2
        // System.out.println("the area of the cylinder surface area is:" +
        // a.surfaceArea());
        // System.out.println("the Volume of the cylinder is:" + a.volumeofarea());

        Rectangle r = new Rectangle(10, 20);
        System.out.println(r.getlength());
        System.out.println(r.getbreath());

    }
}
