

class MyThr extends Thread{
    public MyThr(String Name){
        super(Name);
    }
    public void run(){
        System.out.println("thank you so much!!!");
        // while(true){
        //     System.out.println("I am a thread");
        // }
    }
}

public class cwh_73 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MyThr t=new MyThr("KUNJ");
        t.start();
        System.out.println("The id of the thread is: "+t.getId());
        System.out.println("the name of the thread is:"+t.getName());
    }
}
