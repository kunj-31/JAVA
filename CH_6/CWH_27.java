package CH_6;

public class CWH_27 {
    public static void main(String[] args) {
        // int numbers[] = { 1, 2, 3 };
        float numbers[] = { 1.5f, 2.5f, 3.5f };
        String students[] = { "Harry", "Rohan", "Shubham", "Lovish" };
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(students.length);
        System.out.println(students[0]);

        // display the array (for loop)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //quick quiz-reverse ordering the array
        for (int i = students.length-1; i >= 0; i--) {
            System.out.println(students[i]);
        }

        //for-each loop
        for(float element: numbers) {
            System.out.println(element);
        }
    }
}
