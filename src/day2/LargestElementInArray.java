package day2;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] str = {33,44,33,55,77,55,88,44};
		int set1=0;
		for(int get: str) {
			if(get>set1) {
				set1=get;
			}
		} 
		System.out.println(set1);
	}

}
