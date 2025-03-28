package day3;

import java.util.Scanner;

public class IntegerNumberByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str ="11235453";
		
		Scanner myObj1 = new Scanner(System.in);  
        System.out.println("Enter the number ");
        String imp = myObj1.nextLine();
        
       getNum(imp);
		
	}
	
	public static void getNum(String userin) {
		String value1= "13433254";
		String valueNum = "";
		for(int i=0; value1.length()>i; i++) {
			if(value1.charAt(i)==userin.charAt(0)) {
				valueNum += value1.charAt(i);
			}
		} 
		System.out.println("this number is repeated for " +valueNum.length() + " time");
	}

}
