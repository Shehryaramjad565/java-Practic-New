package Day5;

public class InnerClassAssesingOuterClassLibrary {
	
	public String LibraryName;
	
	

	public InnerClassAssesingOuterClassLibrary(String LibraryName) {
		this.LibraryName = LibraryName;
	}
	
	class Book{
		
		public Book() {
			super();
		}

		public String getLibraryName() {
			return LibraryName;
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassAssesingOuterClassLibrary objlib = new InnerClassAssesingOuterClassLibrary("Oxford");
		Book objbook = objlib.new Book();
		System.out.println(objbook.getLibraryName());
	}

}
