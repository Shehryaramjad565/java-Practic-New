package day2;

public class Move0ToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,43,0,54,65,0,34,0};
		for(int get: arr) {
			if(arr[get]==0 && arr[get+1] !=0) {
//				System.out.println();
				swap(arr,get,get+1);
				
			}
		}
	}

}
