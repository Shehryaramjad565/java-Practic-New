package Day5;

public class LocalClassLocalVariableHouse {
	
	public void LocalArea() {
		 
		class Room{
			public int getArea(int length, int width) {
				return length * width;
			}
		}
		
		Room objroom = new Room();
		System.out.println(objroom.getArea(3,4));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalClassLocalVariableHouse obj1 = new LocalClassLocalVariableHouse();
		obj1.LocalArea();
		
	}

}
