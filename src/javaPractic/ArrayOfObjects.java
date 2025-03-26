package javaPractic;


class Myclass {
	String name;
	String Age;
	
	public Myclass(String name, String age) {
		this.name=name;
		this.Age=age;
	}
	public void getdata() {
		System.out.println("name is " + this.name + " age is " + this.Age);
	}

}

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass[] obj= {new Myclass("ali","44"), new Myclass("ahmad","55")};
		
		for (Myclass get: obj) {
			get.getdata();
		}

		
	}

	
	}









