package Day5;

interface Anony{
	void SayHello();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anony obj1 = new Anony() {
			@Override
			public void SayHello() {
				System.out.println("hello inside the anonymous class");
			}
		};
		obj1.SayHello();
	}

}



