package Day4;

public class ConstructorOverloading {
	
	static class Cat{
		private String name;
		private String title;

		public Cat() {
			this.name="unknown";
			this.title="not found";
		}
		public Cat(String name,String title) {
			this.name=name;
			this.title=title;
		}
		
		public void getdata() {
			System.out.println("book name is " + name + " and " + " title of book is " + title);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj0 = new Cat();
		Cat obj = new Cat("the earth"," our earth ");
		obj.getdata();
		System.out.println(obj0.name);
	}

}
