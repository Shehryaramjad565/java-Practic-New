package Day4;

class Animal{
	String Name;
	public Animal(String name) {
		this.Name=name;
		System.out.println("animal constructor is called");
	}
}

public class ConstructorChaining extends Animal {


	String feature;
	public ConstructorChaining(String name,String feature) {
		super(name);
		// TODO Auto-generated constructor stub
		this.feature=feature;
	}
	
	public void display() {
		System.out.println("the animal name is " + this.Name + " and feature is " + this.feature);
	}


	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining obj = new ConstructorChaining("dog","breed");
		obj.display();
	}

}
