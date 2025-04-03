package Day5;

public class InnerClassWithConstructorPerson {
	
	class Address{
		public String city;
		public String state;
		public Address(String city, String state) {
			super();
			this.city = city;
			this.state = state;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerClassWithConstructorPerson objperson = new InnerClassWithConstructorPerson();
		Address objaddress = objperson.new Address("jhang", "punjab");
		System.out.println(objaddress.city);
		System.out.println(objaddress.state);

	}

}
