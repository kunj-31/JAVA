package PRCTISESET.SET_10;

class Circle {
    public int redius;
    public int height;

    public float area(float redius) {
        float area = 3.14f * redius * redius;
        return area;
    }

    public float peramiter(int redius) {
        float per = 3.14f * 2 * redius;
        return per;
    }

}

class Cylinder extends Circle {
    public float area(float redius, float height) {
        float Area = 2 * 3.14f * redius * height + 2 * 3.14f * redius * redius;
        return Area;
    }

    public float peramiter(int redius, int height) {
        float per = 3.14f * redius * redius * height;
        return per;
    }

}

class Rectangle {
    public int lenght;
    public int breath;

    Rectangle(int lenght, int breath) {
        this.breath = breath;
        this.lenght = lenght;
    }

    public void peramiter() {
        float per = 2 * (lenght + breath);
        System.out.println("the peramiter of the rectangle is:" + per);
    }

    public void area() {
        float Area = lenght * breath;
        System.out.println("the area of the rectangle is:" + Area);

    }
}

class Cube extends Rectangle {

    Cube() {
        super(15, 20);
        System.out.println("i am constructer of the Cube");
    }

    public void area() {
        float area = lenght * lenght * lenght;
        System.out.println("the area  of the cube is:" + area);
    }

}

public class Cwh_10 {
    public static void main(String[] args) {
        // problem_1
        // Cylinder cl = new Cylinder();
        // System.out.println("the area of the circle is:" + cl.area(15));
        // System.out.println("the area of the cylinder is:" + cl.area(16, 17));
        // System.out.println("the per of the circle is:" + cl.peramiter(16));
        // System.out.println("the peramiter of the volume is:" + cl.peramiter(85, 18));

        // problem_2
        Rectangle obj = new Cube();
        obj.area();
        obj.peramiter();
    }
}
