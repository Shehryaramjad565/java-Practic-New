package day3;

import java.util.Scanner;

public class MintsToYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj1 = new Scanner(System.in);  
        System.out.println("Enter the password ");
        int values = myObj1.nextInt(); 
        
        int toyear = ((values/60) / 24) / 365;
        System.out.println(toyear);
	}

}
