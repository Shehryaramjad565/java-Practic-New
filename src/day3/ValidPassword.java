

package day3;

import java.util.Scanner;

public class ValidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj1 = new Scanner(System.in);  
        System.out.println("Enter the password ");
        String values = myObj1.nextLine(); 
        String str = "123456789";
        String alp = "qwertyuiopasdfghjklzxcvbnm";
        String numlen = "";
        String alplen= "";
        
        for(int i=0; values.length()>i; i++) {
        	
        	for(int j=0; str.length()>j; j++) {
        		if(values.charAt(i)== str.charAt(j)) {
        			numlen+=values.charAt(i);
        		}
        	}
        }
        
        
        for(int i=0; values.length()>i; i++) {
        	
        	for(int j=0; alp.length()>j; j++) {
        		if(values.charAt(i)== alp.charAt(j)) {
        			alplen+=values.charAt(i);
        		}
        	}
        }
        
        
        
        if (numlen.length()<=2) {
        	System.out.println("there should be 2 number");
        }
        if(alplen.length()<=2){
        	System.out.println("there should be 2 alphabet");
        }
        
        if(numlen.length() + alplen.length()<8) {
        	System.out.println("password length should be 8 character");
        }
        else {
        	System.out.println("good password is correct");
        }
//        System.out.println(numlen.length());
//
//        System.out.println(alplen.length());
	}

}
