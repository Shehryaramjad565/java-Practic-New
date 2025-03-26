package javaPractic;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Payment payment = new PayPalPayment();
	        payment.pay();

	}

}





interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paying via Credit Card...");
    }
}

class PayPalPayment implements Payment {
    public void pay() {
        System.out.println("Paying via PayPal...");
    }
}

