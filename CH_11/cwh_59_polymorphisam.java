interface Camera {
    void takeSnap();

    void recordVideo();

    default void record4kvideo() {
        System.out.println("Recoding in 4k video");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectTONetwork(String network);
}

class MyCellPhone {
    void Callnummber(int phonenumber) {
        System.out.println("Calling " + phonenumber);
    }

    void pickCall() {
        System.out.println("Connecting.....");
    }
    // void takeSnap(){
    // System.out.println("Taking snap");
    // }
}

class MySmartphone extends MyCellPhone implements Wifi, Camera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Starting the video");
    }

    public void record4kvideo() {
        System.out.println("hii and hello");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "HARRY", "KUNJ", "1234" };
        return networkList;
    }

    public void connectTONetwork(String network) {
        System.out.println("Connecting to" + network);
    }
}

public class cwh_59_polymorphisam {
    public static void main(String[] args) {
       //
        Camera c1=new MySmartphone();
        //
       // c1.getNetworks(); ----->this is not allowed
        c1.record4kvideo();
        c1.takeSnap();
        MySmartphone  s=new MySmartphone();
        s.Callnummber(1234);
        s.getNetworks();
        s.recordVideo();
    }
}
