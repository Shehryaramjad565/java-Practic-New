package InheritanceDay5;


abstract class Vehicle{
	public int fuel;
	public int distance;
	public int speed;
	
	
	public Vehicle(int fuel, int distance, int speed) {
		
		this.fuel = fuel;
		this.distance = distance;
		this.speed = speed;
	}
	
	public abstract void getdata();
	
	
	
	
}


class Car extends Vehicle{

	public Car(int fuel, int distance, int speed) {
		super(fuel, distance, speed);
		// TODO Auto-generated constructor stub
	}
	
	public void getdata() {
		System.out.println(" fuel average of car is " + this.fuel + " distance " + this.distance + " speed " + this.speed);
	}
	
	
}

class Truck extends Vehicle{

	public Truck(int fuel, int distance, int speed) {
		super(fuel, distance, speed);
		// TODO Auto-generated constructor stub
	}
	public void getdata() {
		System.out.println(" fuel average of truck is " + this.fuel + " distance " + this.distance + " speed " + this.speed);
	}
	
	
}
public class main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car objcar = new Car(2,60,100);
		Truck objtruck = new Truck(2,10,40);
		objcar.getdata();
		objtruck.getdata();
		

	}

}
