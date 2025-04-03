package AbstractClassDay5;

 abstract class MyBank{
	
	public int AccountNumber;
	public int balance;
	
	
	public MyBank(int accountNumber, int balance) {
		
		AccountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	public int getBalence() {
		return this.balance;
	}
	public int getaccountNumber() {
		return this.AccountNumber;
	}
	
	public abstract void deposit();
	
	public abstract void withdral();
}


 
 class CurrentAccount extends MyBank{
	 public CurrentAccount(int accountNumber, int balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	public void deposit(int amount) {
		 this.balance = getBalence() + amount;
		 System.out.println("balence after deposit" + this.balance);
		 
	 }
	 
	public void withdral(int amount) {
		if(getBalence()>amount) {
			this.balance = getBalence() - amount;
			System.out.println("balence after withdral " + this.balance);
			
		}
		else {
			System.out.println("there is unsufficient money");
		}
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdral() {
		// TODO Auto-generated method stub
		
	}
	 
 }

public class Bank {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount objbank = new CurrentAccount(434, 1000);
		System.out.println("initial money" + objbank.getBalence());
		objbank.deposit(500);
		System.out.println("after deposit money" + objbank.getBalence());
		objbank.withdral(700);
		System.out.println("after withdral money" + objbank.getBalence());
		objbank.withdral(2000);

	}

}

