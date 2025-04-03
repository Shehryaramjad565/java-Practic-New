package InheritanceDay5;


class Animal {

 public void move() {
     System.out.println("Animal moves");
 }
} 



 class Cheetah extends Animal {

 @Override
 public void move() {
     System.out.println("This cheetah is running!");
 }
}


public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Animal objani = new Animal();
		objani.move();
		
		Cheetah objchee = new Cheetah();
		objchee.move();
	}

}
