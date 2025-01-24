import java.util.Scanner;

public class avaerage {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR SUBJECT MARKS");
        Scanner marks = new Scanner(System.in);
        System.out.println("ENTER THE ENGLISH MARKS");
        int eng = marks.nextInt();
        System.out.println("ENTER THE HINDI MARKS");
        int hin = marks.nextInt();
        System.out.println("ENTER THE MATHS MARKS");
        int math = marks.nextInt();
        System.out.println("ENTER THE SCIENCE MARKS");
        int sci = marks.nextInt();
        System.out.println("ENTER THE SOCIAL SCIENCE MARKS");
        int ssc = marks.nextInt();
        int total = eng + hin + math + sci + ssc;
        float percentage = (total / 500.0f) * 100.00f;
        System.out.println("Your average percentage is: "+percentage+"%");

        marks.close();
    }
}
