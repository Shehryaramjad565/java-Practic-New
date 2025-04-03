package day3;

public class MaximumElementInlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int[] arr = {33,55,34,65,75,35};
	 
	 int maxElement= findMax(arr);
	 System.out.println("this is max value " + maxElement);
	 
	}

	private static int findMax(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for (int item: arr) {
			if(item >max) {
				max=item;
			}
		}
		return max;
	}

}
