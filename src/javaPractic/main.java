//thread in java


package javaPractic;


class Delivery extends Thread {
    public void run() {
        System.out.println("Delivering food...");
    }


}

public class main  {
    public static void main(String[] args) {
        Delivery order1 = new Delivery();
        Delivery order2 = new Delivery();
        
        order1.start();
        order2.start();
    }
}
