package PolymorphismDay6;

class Vehicle{
	
	public void speedUp() {
		System.out.println("initial speed up");
	}
	
	
}
class Car extends Vehicle{
	public void speedUp() {
		System.out.println("car speed limit is upto 240kmph");
	}
}

class Bicycle extends Vehicle{
	public void speedUp() {
		System.out.println("bike speed limit is 40kmph");
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle objv = new Vehicle();
		objv.speedUp();
		
		Car objc = new Car();
		objc.speedUp();
		
		Bicycle objb = new Bicycle();
		objb.speedUp();

	}

}
