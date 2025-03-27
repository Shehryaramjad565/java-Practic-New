package Day1;

import java.util.Scanner;

public class NumberComparison {

	public static void main(String[] args) {

		System.out.println("every next number should be greater ");
		
		Scanner myObj1 = new Scanner(System.in);  
        System.out.println("Enter first number");
         int First = myObj1.nextInt(); 
         
         
         Scanner myObj2 = new Scanner(System.in); 
         System.out.println("Enter second number");
          int second = myObj2.nextInt();
         
         
         if (second>First ) {
        	 System.out.println(true);
        	 Scanner myObj3 = new Scanner(System.in);  
             System.out.println("Enter third number");
              int third = myObj3.nextInt();
              if(third>second) {
            	  System.out.println(true);
              }
        	 
         }
         else {
        	 System.out.println(false);
         }
	}

}
