package InheritanceDay5;

public class Animal1 {
	public void makesound() {
		System.out.println("make sound");
	}
	
	class Dog extends Animal1{
		@Override
		public void makesound() {
			System.out.println(" who who");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal1 objAnimal = new Animal1();
		Dog objDog = objAnimal.new Dog();
		objAnimal.makesound();
		objDog.makesound();
	}

}
