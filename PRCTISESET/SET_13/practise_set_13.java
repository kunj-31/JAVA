package PRCTISESET.SET_13;

class Threadg extends Thread{
    @Override
    public void run(){
        while(true){
        System.out.println("Good Morning!!");
        }
    }
}


class ThreadW extends Thread{
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("welcome in our School!!");
        }
    }
}
public class practise_set_13 {
    public static void main(String[] args) {
        Threadg goood=new Threadg();

        ThreadW welcome=new ThreadW();
        goood.setPriority(6);
        welcome.setPriority(9);
        System.out.println(goood.getPriority());
        System.out.println(welcome.getPriority());
        // goood.start();
        // welcome.start();
    }
}
