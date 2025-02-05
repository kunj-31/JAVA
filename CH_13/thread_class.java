
class threadOne  extends Thread{

   
     public threadOne(String name){
        super(name);
         }

         @Override
         public void run() {
            System.out.println("Thank you!!!!");
         }
}
        public class thread_class {
            @SuppressWarnings("deprecation")
            public static void main(String[] args) {
        threadOne one=new threadOne("KUNJ");
        Thread three=new Thread(one);
        three.start();
        System.out.println("Thank you for the Name:"+one.getName());
        System.out.println("the id is:"+three.getId());


    }
}
