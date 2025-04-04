package OOPendDay6;

class TraficLight{
	public String color;
	public int duration;
	public TraficLight(String color, int duration) {
		
		this.color = color;
		this.duration = duration;
	}
	
	public String changeColor() {
		return this.color="green";
	}
	
}

public class TrafficLight8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraficLight obj = new TraficLight("red",30);
		if(obj.color=="red") {
			System.out.println("you cannot go its red color wait for " + obj.duration + "s");
			
		}
		obj.changeColor();
		if (obj.color=="green") {
			System.out.println("you are good to go its green");
		}
		
		

	}

}
