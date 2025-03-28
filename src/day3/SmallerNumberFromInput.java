package day3;

import java.util.Scanner;

public class SmallerNumberFromInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj1 = new Scanner(System.in);  
        System.out.println("Enter first number");
        int values = myObj1.nextInt(); 
        
        Scanner myObj2 = new Scanner(System.in);  
        System.out.println("Enter second number");
        int values2 = myObj1.nextInt(); 
        
        Scanner myObj3 = new Scanner(System.in);  
        System.out.println("Enter third number");
        int values3 = myObj1.nextInt(); 
        
        System.out.println("lowest value is " + Math.min(values, Math.min(values2, values3)));
        
	}

}
