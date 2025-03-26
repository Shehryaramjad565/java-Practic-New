package javaPractic;

public class EcemptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=0;
		
		try {
			int get= a / b;
		}
		catch(Exception e){
			System.out.println( "there is exception " + e);
		}
		
		
		
		

	}

}
