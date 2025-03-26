package javaPractic;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new SavingsAccount();
        acc.calculateInterest();

	}

}


abstract class Account {
    abstract void calculateInterest(); // Abstract method
}

class SavingsAccount extends Account {
    void calculateInterest() {
        System.out.println("Calculating interest for Savings Account...");
    }
}


