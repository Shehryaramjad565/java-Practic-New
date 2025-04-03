package Day5;

public class InnerClassComputer {
	
	class Processor{
		
		public String name;
		public String speed;
		public Processor(String name,String speed) {
			this.name=name;
			this.speed=speed;
		}
		
		public void DisplayDetails() {
			System.out.println("processor name is " + this.name + " speed is "  + this.speed );
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassComputer objC = new InnerClassComputer();
	    Processor objP = objC.new Processor("itel", "2.0");
	    objP.DisplayDetails();
		
	}

}
