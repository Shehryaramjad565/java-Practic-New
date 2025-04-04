package EncapsulationDay6;

public class Main1Person {
	private String name;
	private int age;
	private String country;
	

	public Main1Person(String name, int age, String country) {
		
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void setter() {
		this.name="change to ahsan";
		this.age= 55;
		this.country="change to usa";
	}
	
	public void getter() {
		System.out.println("person name is " + this.name + " age is " + this.age + " and  country is " + this.country);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1Person obj = new Main1Person("ajaz", 33, "pk");
		obj.setter();
		obj.getter();

	}

}
