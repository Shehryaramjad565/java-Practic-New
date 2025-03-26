package javaPractic;


class FoodOrder extends Thread {
    private String orderName;

    public FoodOrder(String orderName) {
        this.orderName = orderName;
    }

    public void run() {
        System.out.println(orderName + " is being prepared...");
        try {
            Thread.sleep(2000); // Simulating time taken to prepare food
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(orderName + " is ready!");
    }
}

public class Multithreating {
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder("Pizza");
        FoodOrder order2 = new FoodOrder("Burger");

        order1.start();
        order2.start();
    }
}
