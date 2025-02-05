class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        // int i = 34;

        while (true) {
            // System.out.println("I am a thread");
            System.out.println("Thank you: ");
            try{
                Thread.sleep(455);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}

class MyThr2 extends Thread {
    public MyThr2(String name) {
        super(name);
    }

    public void run() {
        // int i = 34;

        while (true) {
            // System.out.println("I am a thread");
            System.out.println("Good buy: ");
            
        }

    }
}




public class cwh_75 {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr2 t2 = new MyThr2("Harry2");
        t1.start();
        // try{
        // t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        
        t2.start();
    }
    }

