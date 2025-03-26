package javaPractic;

class Bank{
	
	 public void withdral(int amount) {
		 System.out.println("withdral amount " + amount);
		 }
	 
	 public void withdral(int amount, String currency) {
		 System.out.println("Withdral amount with currency " + amount +" " + currency);
	 }
}

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj= new Bank();
		obj.withdral(500);
		obj.withdral(500, "PKR");
		
	}

}
