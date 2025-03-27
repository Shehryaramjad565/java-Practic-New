package day2;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmallestAndLargestValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj1 = new Scanner(System.in);  
        System.out.println("Enter first number");
        int values = myObj1.nextInt(); 
         
        List<Integer> mylist = Collections.<Integer>emptyList();
        mylist.add(values);
        System.out.println(mylist.getFirst());
//        mylist.
	}

}
