package javaPractic;

class Encap{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getData() {
		return this.name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap obj= new Encap();
		obj.setName("shehryar");
		String get = obj.getData();
		System.out.println(get);
	}

}
