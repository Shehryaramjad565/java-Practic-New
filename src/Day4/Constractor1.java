package Day4;

public class Constractor1 {
	

	static class Cat{
		private String name;
		private int age;

		public Cat(String name, int age) {
			this.name=name;
			this.age=age;
		}
	}
	
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Cat obj = new Cat("Unknown", 33);
		String name = obj.name;
		System.out.println(name);

	}

}
