
interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

     void sppedUP(int increment);

}

interface horn {
    void blowloudHorn();
    void blowlowHorn();
    
}

//class Cycle implements Bicycle,horn {
    // public void blowloudHorn() {
    //     System.out.println("Pee pop pop...");
    // }

    // public void blowlowHorn(){
    //     System.out.println("peeee pee pe p....");
    // }

    // public void applyBrake(int decrement) {
    //     System.out.println("Appplying Breake");
    // }

    // public void sppedup(int increment) {
    //     System.out.println("Applying increment");
    // }
//}



public class cwh_54_interfase {
    public static void main(String[] args) {
        // you can create proprties in Interfaces
       // Cycle kunjCycle = new Cycle();

        // you cannot modify the proprties in Interfaces as they are final
        //kunjCycle.applyBrake(2);
        //System.out.println(kunjCycle.a);

        // kunjCycle.blowloudHorn();
        // kunjCycle.blowlowHorn();
    }
}

// The type AvonCycle must implement the inherited abstract method
// Bicycle.sppedUP(int)