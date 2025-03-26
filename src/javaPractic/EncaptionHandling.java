package javaPractic;



class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }
}  


public class EncaptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  BankAccount account = new BankAccount();
	        try {
	            account.withdraw(6000);
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }

	}

}





