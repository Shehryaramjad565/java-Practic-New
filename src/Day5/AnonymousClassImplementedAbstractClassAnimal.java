package Day5;

//abstract class Animal{
//	abstract void makesound();
//}
//
//
//public class AnonymousClassImplementedAbstractClassAnimal {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Animal obj1 = new Animal() {
//			
//			@Override
//			public void makesound() {
//				System.out.println("Meow");
//			}
//		};
//		obj1.makesound();
//		
//	}
//
//}







public class AnonymousClassImplementedAbstractClassAnimal {
	
	abstract static class Animal{
		abstract void makesound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal obj1 = new Animal() {
			
			@Override
			public void makesound() {
				System.out.println("Meow");
			}
		};
		obj1.makesound();
		
	}

}