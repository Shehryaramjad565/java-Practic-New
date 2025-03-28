package day3;

public class NumberGreaterThenAverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,3,2,6,6,2,400};
		int init = 0;
		
		for (int get: arr) {

			init += get;
		
		}
		int aver= init/2; 
		for(int get1: arr) {
			if (get1>aver) {
				System.out.println(get1+ " this is greater the list average");
			}
			else {
				System.out.println(get1+ " this is less the list average");
			}
		}
//		
//		System.out.println("list average is " + aver);
//		if 
		System.out.println(aver);
	}

	}
