package day3;

import java.util.Scanner;

public class LeapYearFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj1 = new Scanner(System.in);  
        System.out.println("Enter first number");
        int value = myObj1.nextInt(); 
        
        if(value % 100 != 0 && value % 4 == 0) {
        	
        		System.out.println("its a leap year");
        	
        }
        
        else if(value % 100 == 0 && value % 4== 0 && value % 400==0) {
        	System.out.println("its a leap year");
        }
        else {
        	System.out.println("its not a leap year");
        }
        

	}

}
