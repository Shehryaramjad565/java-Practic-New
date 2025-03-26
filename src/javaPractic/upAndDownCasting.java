package javaPractic;


class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}


public class upAndDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Upcasting (Child to Parent)
        Vehicle v = new Car();
        v.start(); // Works because it's in Vehicle class

        // Downcasting (Parent to Child)
        Car c = (Car) v;
        c.drive(); // Works because object is actually a Car

	}

}






