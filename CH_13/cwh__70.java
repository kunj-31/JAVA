/*concurrency vs parallellism
multithreading in java
1>extending the threading class
2>by implementing running interface
*/

//extending the threading class method
class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My Thread is Running");
            System.out.println("I am happy!");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2 is good");
            System.out.println("I am sad1");
        }
    }

}

public class cwh__70 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}