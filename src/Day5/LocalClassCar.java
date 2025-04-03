package Day5;

public class LocalClassCar {
	
	public void StartEngine1() {
		class StartEngine{
			
			public void run() {
				System.out.println("enginee is running ");
			}
		}
//		LocalClassCar objL = new LocalClassCar();
//		Object objS = objL.new StartEngine();
		StartEngine objS = new StartEngine();
        objS.run();  // Call the method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalClassCar obj = new LocalClassCar();
		obj.StartEngine1();

	}

}
